package com.example.handler;

import com.example.conts.AppConstant;
import org.springframework.stereotype.Component;

/**
 * @author shili.huang
 * @date 2020/12/29
 */
@Component
public class DefaultCombinationHandler extends AbstractCombinationHandler{

    @Override
    public String type() {
        return AppConstant.DEFAULT;
    }

}
