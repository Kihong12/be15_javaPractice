package com.kihongkim.level03.hard;

import java.util.Random;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int row, col;

        while (true) {
            System.out.print("가로 행의 수를 입력하세요 : ");
            row = sc.nextInt();
            if (row > 10 || row < 1) {
                System.out.print("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요");
                continue;
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("세로 행의 수를 입력하세요 : ");
            col = sc.nextInt();
            if (col > 10 || col < 1) {
                System.out.print("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요");
                continue;
            } else {
                break;
            }
        }

        char[][] chars = new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                chars[i][j] = (char) ('A' + rand.nextInt(26));
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(chars[i][j] + " ");
            }
            System.out.println();
        }
    }
}
