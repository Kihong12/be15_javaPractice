package com.kihongkim.level01.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력 : ");
        String str = sc.nextLine();

        String[] words = str.split("\\s+");
        String[] uniquewords = new String[words.length];
        int[] wordCounts = new int[words.length];
        int uniqueIndex = 0;

        for (String word : words) {
            word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");

            if (!word.isEmpty()) {
                boolean found = false;
                for (int i = 0; i < uniqueIndex; i++) {
                    if (uniquewords[i].equals(word)) {
                        wordCounts[i]++;
                        found = true;
                        break;
                    }
                }

                if (!word.isEmpty()) {
                    uniquewords[uniqueIndex] = word;
                    wordCounts[uniqueIndex] = 1;
                    uniqueIndex++;
                }
            }
        }

        String mostFrequnetWord = null;
        int maxCount = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < uniqueIndex; i++) {
            result.append(uniquewords[i]).append(": ").append(wordCounts[i]).append("\n");

            if (wordCounts[i] > maxCount) {
                maxCount = wordCounts[i];
                mostFrequnetWord = uniquewords[i];
            }
        }

        System.out.println("Arrays.toString(words) : " + Arrays.toString(words));
        System.out.println("Arrays.toString(uniqueWords) : " + Arrays.toString(uniquewords));
        System.out.println("Arrays.toString(wordCounts) : " + Arrays.toString(wordCounts));

        System.out.println("==== 단어 빈도 ====");
        System.out.println(result);
        System.out.println("가장 빈도 높은 단어 : " + mostFrequnetWord + " (" + maxCount + " 번)");
    }
}
