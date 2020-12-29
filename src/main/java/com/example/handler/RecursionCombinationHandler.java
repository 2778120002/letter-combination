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
public class RecursionCombinationHandler implements CombinationHandler{

    @Override
    public String type() {
        return AppConstant.RECURSION;
    }

    @Override
    public List<String> getLetterCombinations(String number) {
        ArrayList<String> res = new ArrayList<>();
        if("".equals(number)){
            return res;
        }
        number = number.replaceAll("[0,1]","");
        findCombination(number, 0, "",res);
        return res;
    }

    private void findCombination(String digits, int index, String s,ArrayList<String> res){
        if(index == digits.length()){
            res.add(s);
            return;
        }
        char c = digits.charAt(index);
        String letters = LetterEnum.findLetterByNumber(c - '0');
        for(int i = 0 ; i < letters.length() ; i ++){
            findCombination(digits, index+1, s + letters.charAt(i),res);
        }

    }

}
