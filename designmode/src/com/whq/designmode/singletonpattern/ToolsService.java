package com.whq.designmode.singletonpattern;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/8 17:07
 * @desc:
 */
public class ToolsService {
    private ToolsService(){}
    private static ToolsService toolsService = new ToolsService();

    public static ToolsService getInstances(){
        if (toolsService == null){
            toolsService = new ToolsService();
        }

        return toolsService;
    }
}
