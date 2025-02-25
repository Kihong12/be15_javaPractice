package com.kihongkim.level01.basic;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

        String[] words = str.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(capitalizeWord(word)).append(" ");
        }
        if (!sb.isEmpty()) {
            sb.setLength(sb.length() - 1);
        }

        System.out.println("변환된 문자열 : " + sb);
        System.out.println("총 단어 개수 : " + words.length);
    }

    private static String capitalizeWord(String word) {
        if (word.isEmpty()) {
            return word;
        }
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }
}
