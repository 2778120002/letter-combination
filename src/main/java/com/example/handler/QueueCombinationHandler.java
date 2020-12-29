package com.example.handler;

import com.example.conts.AppConstant;
import com.example.enums.LetterEnum;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

/**
 * @author shili.huang
 * @date 2020/12/29
 */
@Component
public class QueueCombinationHandler implements CombinationHandler{

    @Override
    public String type() {
        return AppConstant.QUEUE;
    }

    /**
     * Use queue first in first out,Dequeue the previous string
     * Concatenate new characters and join the newly generated string
     * @param number
     * @return
     */
    @Override
    public List<String> getLetterCombinations(String number) {
        LinkedList<String> ans = new LinkedList<>();
        if(number.isEmpty()) {
            return ans;
        }
        ans.add("");
        number = number.replaceAll("[0,1]","");
        for(int i =0; i<number.length();i++){
            int index = Character.getNumericValue(number.charAt(i));
            while(ans.peek() != null && ans.peek().length() == i){
                String t = ans.remove();
                for(char s : LetterEnum.findLetterByNumber(index).toCharArray()){
                    ans.add(t+s);
                }
            }
        }
        return ans;
    }


}
