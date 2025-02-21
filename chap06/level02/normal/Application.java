package com.kihongkim.level02.normal;

public class Application {
    public static void main(String[] args) {
        BookDTO bookDTO = new BookDTO();
        BookDTO bookDTO1 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        BookDTO bookDTO2 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
    }
}
