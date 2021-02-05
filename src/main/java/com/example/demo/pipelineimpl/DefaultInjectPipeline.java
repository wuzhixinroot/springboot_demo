package com.example.demo.pipelineimpl;

import com.example.demo.context.IContext;
import com.example.demo.pipeline.AbstractInjectPipeline;
import com.example.demo.plugin.Injector;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhixin.wu
 * @date 2021/1/27 18:06
 */

public class DefaultInjectPipeline extends AbstractInjectPipeline<IContext, Injector> {
    @Setter
    private List<Injector> processList;

    @Override
    public List<Injector> getInjectPipelineList() {
        return processList;
    }
}
