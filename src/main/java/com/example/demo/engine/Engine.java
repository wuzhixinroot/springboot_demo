package com.example.demo.engine;

import com.example.demo.context.IContext;
import com.example.demo.result.FlowResult;

/**
 * @author zhixin.wu
 * @date 2021/1/28 09:17
 */
public interface Engine<P extends IContext> {

    FlowResult process(IContext context);
}
