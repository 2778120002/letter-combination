package com.example.handler;

import java.util.List;

/**
 * @author shili.huang
 * @date 2020/12/29
 */
public interface CombinationHandler {

    /**
     * Handler Type
     * @return type
     */
    String type();

    /**
     *  Get the corresponding letter list
     * @param number
     * @return
     */
    List<String> getLetterCombinations(String number);

}
