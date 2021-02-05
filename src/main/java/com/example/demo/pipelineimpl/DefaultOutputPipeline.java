package com.example.demo.pipelineimpl;

import com.example.demo.context.IContext;
import com.example.demo.pipeline.AbstractOutputPipeline;
import com.example.demo.plugin.Output;
import lombok.Setter;

import java.util.List;

/**
 * @author zhixin.wu
 * @date 2021/1/27 18:06
 */

public  class DefaultOutputPipeline extends AbstractOutputPipeline<IContext, Output> {

    @Setter
    private List<Output> outputList;

    @Override
    public List<Output> getOutputPipelineList() {
        return outputList;
    }
}
