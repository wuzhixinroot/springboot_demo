package com.example.demo.plugin;

import com.example.demo.context.IContext;

/**
 * @author zhixin.wu
 * @date 2021/1/27 17:10
 */
public interface Process<P extends IContext> {
    void Process(P context);
}
