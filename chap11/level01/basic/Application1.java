package com.kihongkim.level01.basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Application1 {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("파일 이름을 입력하세요 : ");
        String fileName = sc.nextLine();

        try (FileReader reader = new FileReader(fileName)) {

            System.out.println("===== 파일 내용 출력 =====");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.println((char) character);
            }
        } catch (FileNotFoundException e) {
            System.out.println("오류 : 해당 이름을 가진 파일이 없습니다.");
        } catch (Exception e) {
            System.out.println("오류 : 예기치 못한 오류가 발생하였습니다.");
        }
    }
}
