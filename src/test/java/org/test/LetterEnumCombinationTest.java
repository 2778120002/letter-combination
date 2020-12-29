package org.test;


import com.example.LetterCombinationApp;
import com.example.conts.AppConstant;
import com.example.factory.LetterCombinationFactory;
import com.example.handler.CombinationHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Description
 *
 * @title: NumberLetterCombinationTest
 * @Author: shili.huang
 */
@SpringBootTest(classes = LetterCombinationApp.class)
@RunWith(SpringRunner.class)
public class LetterEnumCombinationTest {

    @Autowired
    private LetterCombinationFactory factory;


    @Test
    public void testLetterCombinations() {
        // Get the default processor
        CombinationHandler defaultHandler = factory.getHandler(AppConstant.DEFAULT);
        CombinationHandler simpleHandler = factory.getHandler(AppConstant.SIMPLE);
        CombinationHandler recursionHandler = factory.getHandler(AppConstant.RECURSION);
        CombinationHandler queueHandler = factory.getHandler(AppConstant.QUEUE);

        String number = "12";

        System.out.println("DEFAULT HANDLER RESULT = " + defaultHandler.getLetterCombinations(number));

        System.out.println("SIMPLE HANDLER RESULT = " + simpleHandler.getLetterCombinations(number));

        System.out.println("RECURSION HANDLER RESULT = " + recursionHandler.getLetterCombinations(number));

        System.out.println("QUEUE HANDLER RESULT = " + queueHandler.getLetterCombinations(number));
    }

}
