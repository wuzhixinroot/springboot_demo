package com.example.demo.plugin;

import com.example.demo.context.IContext;

/**
 * @author zhixin.wu
 * @date 2021/1/27 17:12
 */
public interface Output <P extends IContext>{
    void show(P context);
}
