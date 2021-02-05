package com.example.demo.pipeline;

import com.example.demo.context.IContext;
import com.example.demo.plugin.Process;

import java.util.Iterator;
import java.util.List;

/**
 * @author zhixin.wu
 * @date 2021/1/27 17:27
 */
public abstract class AbstractProcessPipeline<P extends IContext, I extends Process> implements Pipeline<P>{

    @Override
    public void execute(IContext context) {
        Iterator<I> iterator = getProcessList().iterator();
        while (iterator.hasNext()) {
            I process = iterator.next();
            process.Process(context);
        }
    }

    public abstract List<I> getProcessList();
}
