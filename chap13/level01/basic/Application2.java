package com.kihongkim.level01.basic;

import java.util.LinkedList;
import java.util.Scanner;

/*
* 방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.google.com/
최근 방문 url : [https://www.google.com/]
방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://github.com/
최근 방문 url : [https://github.com/, https://www.google.com/]
방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.notion.so/
최근 방문 url : [https://www.notion.so/, https://github.com/, https://www.google.com/]
방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.naver.com/
최근 방문 url : [https://www.naver.com/, https://www.notion.so/, https://github.com/, https://www.google.com/]
방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://github.com/
최근 방문 url : [https://github.com/, https://www.naver.com/, https://www.notion.so/, https://github.com/, https://www.google.com/]
방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.google.com/
최근 방문 url : [https://www.google.com/, https://github.com/, https://www.naver.com/, https://www.notion.so/, https://github.com/]
방문 URL을 입력하세요 (단, exit를 입력하면 종료) : exit
* */
public class Application2 {
    public static void main(String[] args) {
        LinkedList<String> urls = new LinkedList<>();

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
                String url = sc.nextLine().trim();

                if (url.equalsIgnoreCase("exit")) {
                    break;
                }

                if (url.isEmpty()) {
                    System.out.println("유효한 URL을 입력하세요.");
                    continue;
                }

                urls.addFirst(url);

                if (urls.size() > 5) {
                    urls.removeLast();
                }

                System.out.println("최근 방문 url : " + urls);
            }
        }
    }
}
