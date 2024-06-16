package challenge_11;
import java.util.*;
import java.util.stream.Collectors;
class Member {
    private String name;
    private Gender gender;
    private int age;

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
        return "Member(" + name + ", " + gender + "," + age + ")";
    }

  
}
public class MemberStream {

	  public static void main(String[] args) {
	        List<Member> members = List.of(
	                new Member("홍길동", Gender.남, 25),
	                new Member("배장화", Gender.여, 20),
	                new Member("임꺽정", Gender.남, 29),
	                new Member("연흥부", Gender.남, 28),
	                new Member("김선달", Gender.남, 32),
	                new Member("황진이", Gender.여, 18)
	        );

	        // Member 스트림 원소 출력
	        System.out.println("[Member 스트림 원소]");
	        members.stream()
	                .map(Member::toString)
	                .forEach(System.out::print);

	        System.out.println("\n");

	        // 성별로 그룹핑하여 출력
	        System.out.println("[Member 스트림을 성별로 그룹핑]");
	        Map<Gender, List<Member>> groupedByGender = members.stream()
	                .collect(Collectors.groupingBy(Member::getGender));

	        groupedByGender.forEach((gender, memberList) ->
	                System.out.println(gender + "=" + memberList));
	    }

}
