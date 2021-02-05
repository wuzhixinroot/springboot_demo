package com.example.demo.wuzhixintest;

import com.example.demo.context.WContext;
import com.example.demo.plugin.Output;
import com.example.demo.result.FlowResult;
import org.springframework.stereotype.Component;


/**
 * @author zhixin.wu
 * @date 2021/1/28 15:42
 */
public class WOutput implements Output<WContext> {


    @Override
    public void show(WContext context) {
        context.setFlowResult(new FlowResult(1, "WUZHIXIN"+context.getProcess()));
    }
}
