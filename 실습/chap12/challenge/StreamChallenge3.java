package challenge_12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Member {	
    String name;
    Gender gender;
    int age;

    public Member(String name, Gender gender, int age) {	
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {	
        return name;
    }

    public Gender getGender() {	
        return gender;
    }

    public int getAge() {		
        return age;
    }

    @Override
    public String toString() {	
        return "Member(" + name + ", " + gender + ", " + age + ")";
    }
}

public class StreamChallenge3 {
    static int index = 0;

    public static void main(String[] args) {
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        List<Gender> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);

 
        List<Member> memberList = names.stream()
                .map(name -> new Member(name, genders.get(index), ages.get(index++)))
                .collect(Collectors.toList());

        System.out.println("[Member 스트림 원소]");
        memberList.forEach(member -> System.out.print(member + " "));

        System.out.println(" ");
        Map<Gender, List<Member>> groupedByGender = memberList.stream()
                .collect(Collectors.groupingBy(Member::getGender)); 
 
        System.out.println("\n[Member 스트림을 성별로 그룹핑]");
        System.out.println(groupedByGender);
    }
}
