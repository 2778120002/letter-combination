package com.example.enums;

import lombok.Getter;

/**
 * @author shili.huang
 * @date 2020/12/29
 */
@Getter
public enum LetterEnum {

    ZERO(0, ""),
    ONE(1, ""),
    TWO(2, "abc"),
    THREE(3, "def"),
    FOUR(4, "ghi"),
    FIVE(5, "jkl"),
    SIX(6, "mno"),
    SEVEN(7, "pqrs"),
    EIGHT(8, "tuv"),
    NINE(9, "wxyz");

    ;
    private final int number;

    private final String letter;

    LetterEnum(int number, String letter) {
        this.number = number;
        this.letter = letter;
    }

    public static String findLetterByNumber(Integer number) {
        for (LetterEnum letterEnum : LetterEnum.values()) {
            if (letterEnum.getNumber() == number) {
                return letterEnum.getLetter();
            }
        }
        return "";
    }

}
