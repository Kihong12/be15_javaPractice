package com.kihongkim.looping_and_branching.level02.normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String arr = sc.nextLine();

        for (int i = 0; i < arr.length(); i++) {
            System.out.println(i + " : " + arr.charAt(i));
        }
    }
}
