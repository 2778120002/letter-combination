package com.example.factory;

import com.example.handler.CombinationHandler;
import com.example.handler.DefaultCombinationHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shili.huang
 * @date 2020/12/29
 */
@Component
public class LetterCombinationFactory {

    @Autowired
    private DefaultCombinationHandler defaultCombinationHandler;

    private final Map<String, CombinationHandler> combinationHandlerMap = new HashMap<>();

    public LetterCombinationFactory(List<CombinationHandler> list){
        list.forEach(handler -> combinationHandlerMap.put(handler.type(),handler));
    }

    /**
     * Get handler by type
     * If it does not exist, return to the default handler 'DefaultCombinationHandler'
     * @param type
     * @return
     */
    public CombinationHandler getHandler(String type) {
        return combinationHandlerMap.getOrDefault(type,defaultCombinationHandler);
    }

}
