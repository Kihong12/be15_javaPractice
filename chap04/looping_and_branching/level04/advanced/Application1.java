package com.kihongkim.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();
        System.out.print("숫자를 입력하세요 : ");
        int num = (sc.nextInt() % 26);

        char newChar;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch > 'A' && ch < 'Z') {
                newChar = (char) (ch + num);
                if (newChar > 'Z') newChar -= 26;
            } else if (ch >= 'a' && ch <= 'z') {
                newChar = (char) (ch + num);
                if (newChar > 'z') newChar -= 26;
            } else {
                newChar = ch;
            }
            System.out.print(newChar);
        }
    }
}
