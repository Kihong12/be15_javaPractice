package com.kihongkim.level01.basic;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDTO[] studentDTOS = new StudentDTO[10];

        int count = 0;
        while (count < studentDTOS.length) {
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            System.out.print("반 : ");
            int classroom = sc.nextInt();
            sc.nextLine();

            System.out.print("이름 : ");
            String name = sc.nextLine();

            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            System.out.print("수학점수 : ");
            int math = sc.nextInt();

            studentDTOS[count] = new StudentDTO(grade, classroom, name, kor, eng, math);
            count++;

            System.out.print("계속 추가할 겁니까? (y/n) : ");
            char ch = sc.next().charAt(0);
            sc.nextLine();

            if (ch == 'n') {
                break;
            } else {
                continue;
            }

        }

        for (int i = 0; i < count; i++) {
            System.out.println(studentDTOS[i].getInformation());
        }
    }
}
