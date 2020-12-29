package com.example.handler;

import com.example.conts.AppConstant;
import com.example.enums.LetterEnum;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shili.huang
 * @date 2020/12/29
 */
@Component
public class SimpleCombinationHandler implements CombinationHandler{

    @Override
    public String type() {
        return AppConstant.SIMPLE;
    }

    @Override
    public List<String> getLetterCombinations(String number) {
        number = number.replaceAll("[0,1]","");
        List<String> combinations = new ArrayList<>();
        if (number.length() == 0) {
            return combinations;
        }
        backtrack(combinations, number, 0, new StringBuffer());
        return combinations;
    }


    public void backtrack(List<String> combinations, String digits, int index, StringBuffer combination) {
        if (index == digits.length()) {
            combinations.add(combination.toString());
        } else {
            Integer digit = Integer.valueOf(String.valueOf(digits.charAt(index)));
            String letters = LetterEnum.findLetterByNumber(digit);
            int lettersCount = letters.length();
            for (int i = 0; i < lettersCount; i++) {
                combination.append(letters.charAt(i));
                backtrack(combinations, digits, index + 1, combination);
                combination.deleteCharAt(index);
            }
        }
    }

}
