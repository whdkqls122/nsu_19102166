package challenge_07_programming;

import java.util.Scanner;

public class EchoerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Echor e = new Echor() {               // 익명클래스는 한번만 쓰일려고 만듬.
            @Override
            void echo() {
                String name = "";
                while (!name.equals("끝")){
                    name = in.nextLine();
                    System.out.println(name);
                }
            }
        };
        e.start();
        e.echo();
        e.stop();
    }
}