package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        int number = 0;
        List<WiseSaying> wiseSayings = new ArrayList<>();

        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine().trim();


            if (command.equals("종료")) {
                break;
            }
            else if (command.equals(("등록"))) {
                System.out.print("명언 : ");
                String content = sc.nextLine();
                System.out.print("작가 : ");
                String author = sc.nextLine();
                System.out.println(++number + "번 명언이 등록되었습니다.");

               WiseSaying wiseSaying = new WiseSaying(number, author, content);
               wiseSayings.add(wiseSaying);
            }
            else if (command.equals("목록")) {
                System.out.println("목록 / 작가 / 명언");
                System.out.println("----------------------");
                System.out.println(wiseSayings);
            }
        }
    }
}
