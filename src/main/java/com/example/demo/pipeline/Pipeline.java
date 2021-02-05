package com.example.demo.pipeline;

import com.example.demo.context.IContext;

/**
 * @author zhixin.wu
 * @date 2021/1/27 17:14
 */
public interface Pipeline<P extends IContext> {
    void execute(P context);
}
