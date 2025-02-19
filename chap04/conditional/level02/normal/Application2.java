package com.kihongkim.conditional.level02.normal;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몸무게를 입력하세요 : ");
        int weight = sc.nextInt();
        System.out.print("신장을 입력하세요 : ");
        double height = sc.nextDouble();

        int bmi = (int) (weight / (height * height));

        if (bmi < 20) {
            System.out.println("당신은 저체중 입니다.");
        } else if (bmi >= 20 && bmi < 25) {
            System.out.println("당신은 정상체중 입니다.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("당신은 과제충 입니다.");
        } else {
            System.out.println("당신은 비만입니다.");
        }
    }
}

