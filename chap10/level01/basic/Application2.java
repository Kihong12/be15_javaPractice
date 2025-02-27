package com.kihongkim.level01.basic;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/* ----- 입력 예시 -----
 *
 * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2014-05-05
 *
 * ----- 출력 예시 -----
 *
 * 만 20세 미만은 입장 불가입니다.
 *
 * ----- 입력 예시 -----
 *
 * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 1994-05-05
 *
 * ----- 출력 예시 -----
 *
 * 입장하셔도 됩니다.
 *
 * ----- 입력 예시 -----
 *
 * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2000-14-15
 *
 * ----- 출력 예시 -----
 *
 * 날짜 양식을 잘못 입력하셨습니다.
 */

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
        String str = sc.nextLine();

        try {
            LocalDate birthday = LocalDate.parse(str);
            checkAge(birthday);
            System.out.println("입장하셔도 됩니다.");
        } catch (DateTimeParseException e) {
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkAge(LocalDate birthday) throws InvalidAgeException {
        LocalDate today = LocalDate.now();
        int age = today.getYear() - birthday.getYear();
        if (birthday.plusYears(age).isAfter(today)) {
            age--;
        }
        if (age < 20) {
            throw new InvalidAgeException("만 20세 미만은 입장 불가합니다.");
        }
    }
}
