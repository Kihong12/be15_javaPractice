package com.kihongkim.looping_and_branching.level03.hard;

import java.util.Random;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int count = 1;

        while (true) {
            System.out.print("정수를 입력하세요 : ");
            int num = sc.nextInt();
            if (randomNumber == num) {
                System.out.println("정답입니다. " + count + "회만에 정답을 맞추셨습니다.");
                break;
            } else if (randomNumber > num) {
                System.out.println("입력하신 정수보다 큽니다.");
                count++;
            } else if (randomNumber < num) {
                System.out.println("입력하신 정수보다 작습니다.");
                count++;
            }
        }
    }
}
