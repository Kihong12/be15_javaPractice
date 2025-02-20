package com.kihongkim.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            int rand = (int) (Math.random() * 9) + 1;
            arr[i] = rand;
        }

        int count = 10;
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < count; i++) {
            System.out.print(count + "회 남으셨습니다.");
            System.out.print("4자리 숫자를 입력하세요 : ");
            String num = sc.nextLine();
            if (num.length() != 4) {
                System.out.println("4자리 정수를 입력해야 합니다.");
            } else {
                continue;
            }

            for (int q : arr) {

            }


        }




    }
}
