package com.kihongkim.conditional.level04.advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수를 입력하세요 : ");
        int kor = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        int eng = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        int math = sc.nextInt();

        int avg = (kor + eng + math) / 3;

        if (avg >= 60 && (kor >= 40 && eng >= 40 && math >= 40)) {
            System.out.println("합격입니다!");
        } else if (avg < 60 && (kor >= 40 && eng >= 40 && math >= 40)) {
            System.out.println("평균 점수 미달로 불합격입니다.");
        } else {
            if (kor < 40) {
                System.out.println("국어 점수 미달로 불합격입니다.");
            } else if (eng < 40) {
                System.out.println("영어 점수 미달로 불합격입니다.");
            } else {
                System.out.println("수학 점수 미달로 불합격입니다.");
            }
        }
    }
}

