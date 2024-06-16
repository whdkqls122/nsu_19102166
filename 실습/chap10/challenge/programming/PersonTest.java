package challenge_10_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Person {
    private String name;
    private int height;
    private int weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
    public static List<Person> people = Arrays.asList(
            new Person("황진이", 160, 45),
            new Person("이순신", 180, 80),
            new Person("김삿갓", 175, 65),
            new Person("홍길동", 170, 68),
            new Person("배장화", 155, 48)
    );

}

public class PersonTest {
    public static void main(String[] args) {
    
        // 평균 신장 계산
        double avgHeight = average(Person.people, Person::getHeight);
        System.out.println("평균 신장: " + avgHeight);

        // 평균 체중 계산
        double avgWeight = average(Person.people, Person::getWeight);
        System.out.println("평균 체중: " + avgWeight);
    }

    // 평균 계산 메서드
    public static double average(List<Person> people, Function<Person, Integer> metricExtractor) {
        double sum = 0;
        for (Person person : people) {
            sum += metricExtractor.apply(person);
        }
        return sum / people.size();
    }
}