package com.example.demo.wuzhixintest;

import com.example.demo.context.WContext;
import com.example.demo.plugin.Injector;
import org.springframework.stereotype.Component;

/**
 * @author zhixin.wu
 * @date 2021/1/28 15:42
 */
public class WInject implements Injector<WContext> {

    @Override
    public void inject(WContext context) {
        context.setInject("inject");
    }
}
