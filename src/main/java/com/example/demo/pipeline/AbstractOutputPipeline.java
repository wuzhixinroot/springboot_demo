package com.example.demo.pipeline;

import com.example.demo.context.IContext;
import com.example.demo.plugin.Output;

import java.util.Iterator;
import java.util.List;

/**
 * @author zhixin.wu
 * @date 2021/1/27 17:35
 */
public abstract class AbstractOutputPipeline<P extends IContext, I extends Output> implements Pipeline<P> {
    @Override
    public void execute(IContext context) {
        Iterator<I> iterator = getOutputPipelineList().iterator();
        while (iterator.hasNext()) {
            I output = iterator.next();
            output.show(context);
        }
    }

    public abstract List<I> getOutputPipelineList();
}
