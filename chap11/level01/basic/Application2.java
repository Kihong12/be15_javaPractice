package com.kihongkim.level01.basic;

/* ----- 입력 예시 -----
 *
 * (원본 파일이 존재 하는 경우)
 * 원본 파일의 이름을 입력하세요 : origin.txt
 * 복사 파일의 이름을 입력하세요 : copy.txt
 *
 * ----- 출력 예시 -----
 *
 * 파일 복사가 성공적으로 완료 되었습니다.
 *
 * ----- 입력 예시 -----
 *
 * (원본 파일이 존재하지 않는 경우)
 * 원본 파일의 이름을 입력하세요 : origin2.txt
 * 복사 파일의 이름을 입력하세요 : copy2.txt
 *
 * ----- 출력 예시 -----
 *
 * 오류 : origin2.txt (지정된 파일을 찾을 수 없습니다)
 *
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("원본 파일의 이름을 입력하세요 : ");
        String sourceFile = sc.nextLine();
        System.out.println("복사 파일의 이름을 입력하세요 : ");
        String destinationFile = sc.nextLine();

        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(destinationFile)) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("파일 복사가 성공적으로 완료 되었습니다.");
        } catch (IOException e) {
            System.out.println("오류 : " + e.getMessage());
        }
    }
}
