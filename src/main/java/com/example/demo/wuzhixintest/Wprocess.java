package com.example.demo.wuzhixintest;

import com.example.demo.context.WContext;
import com.example.demo.plugin.Process;
import org.springframework.stereotype.Component;

/**
 * @author zhixin.wu
 * @date 2021/1/28 15:42
 */
public class Wprocess implements Process<WContext> {

    @Override
    public void Process(WContext context) {
        String inject = context.getInject();

        String process = inject + "process";
    }
}
