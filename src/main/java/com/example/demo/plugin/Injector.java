package com.example.demo.plugin;

import com.example.demo.context.IContext;

/**
 * @author zhixin.wu
 * @date 2021/1/27 17:03
 */
public interface Injector<P extends IContext> {

    void inject(P context);
}
