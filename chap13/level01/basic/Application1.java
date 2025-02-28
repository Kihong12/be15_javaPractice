package com.kihongkim.level01.basic;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/*
학생 성적 : 100
추가 입력하려면 y : y
학생 성적 : 95
추가 입력하려면 y : Y
학생 성적 : 66
추가 입력하려면 y : y
학생 성적 : 79
추가 입력하려면 y : n
학생 인원 : 4
평균 점수 : 85.0
*/
public class Application1 {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("학생 성적 : ");
                try {
                    int score = sc.nextInt();
                    scores.add(score);
                } catch (InputMismatchException e) {
                    System.out.println("올바른 정수를 입력하세요.");
                    sc.next();
                    continue;
                }

                System.out.println("추가 입력하려면 y : ");
                String choice = sc.next();
                if (!choice.equalsIgnoreCase("y")) {
                    break;
                }
            }
        }

        if (scores.isEmpty()) {
            System.out.println("입력된 학생 성적이 없습니다.");
            return;
        }

        int total = 0;
        for (Integer score : scores) {
            total += score;
        }

        double average = (double) total / scores.size();
        System.out.println("학생 인원 : " + scores.size());
        System.out.println("평균 점수 : " + average);
    }
}