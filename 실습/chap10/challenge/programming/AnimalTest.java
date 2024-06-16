package challenge_10_programming;

import java.util.function.Supplier;

class Animal {
    public void sound() {
        System.out.println("ㅁㅁㄲㄲ ...");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}

public class AnimalTest {
    // soundAnimal 메서드 정의
    public static void soundAnimal(Supplier<Animal> supplier) {
        Animal animal = supplier.get();
        animal.sound();
    }

    public static void main(String[] args) {
        // soundAnimal 메서드 호출 예시
        soundAnimal(Animal::new); // Animal 객체의 sound 메서드 호출
        soundAnimal(Dog::new);    // Dog 객체의 sound 메서드 호출
    }
}