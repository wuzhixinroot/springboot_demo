package com.example.demo.pipeline;

import com.example.demo.context.IContext;
import com.example.demo.plugin.Injector;

import java.util.Iterator;
import java.util.List;

/**
 * @author zhixin.wu
 * @date 2021/1/27 17:34
 */
public abstract class AbstractInjectPipeline<P extends IContext, I extends Injector> implements Pipeline<P> {

    @Override
    public void execute(IContext context) {
        Iterator<I> iterator = getInjectPipelineList().iterator();
        while (iterator.hasNext()) {
            I injector = iterator.next();
            injector.inject(context);
        }
    }

    public abstract List<I> getInjectPipelineList();
}
