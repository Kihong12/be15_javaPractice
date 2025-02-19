package com.kihongkim.conditional.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월 급여 입력 : ");
        int salary = sc.nextInt();
        System.out.print("매출액 급여 입력 : ");
        int sales = sc.nextInt();

        int total = 0;
        int bonus = 0;
        int bonusRate = 0;

        if (sales >= 50000000) {
            total += (int) salary + (sales * 0.05);
            bonus += (int) sales * 0.05;
            bonusRate += 5;
        } else if (sales >= 30000000) {
            total += (int) salary + (sales * 0.03);
            bonus += (int) sales * 0.03;
            bonusRate += 3;
        } else if (sales >= 10000000) {
            total += (int) salary + (sales * 0.01);
            bonus += (int) sales * 0.01;
            bonusRate += 1;
        } else {
            total += (int) salary + (sales * 0);
            bonus += (int) sales * 0.00;
            bonusRate += 0;
        }
        System.out.println("====================");
        System.out.println("매출액 : " + sales);
        System.out.println("보너스율 : " + bonusRate + "%");
        System.out.println("월 급여 : " + salary);
        System.out.println("보너스 금액 : " + bonus);
        System.out.println("====================");
        System.out.println("총 급여 : " + total);
    }
}
