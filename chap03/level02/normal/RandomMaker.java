package com.kihongkim.level02.normal;

public class RandomMaker {
    //최소값부터 최대값까지 범위의 난수 반환함
    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)+ min);
    }

    //인자의 길이 만큼의 랜덤한 대문자 알파벳으로 이루어진 문자열을 반환함
    public static String randomUpperAlphabet(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char randomChar = (char) ('A' + random.nextInt(26));
        }

    }
}
