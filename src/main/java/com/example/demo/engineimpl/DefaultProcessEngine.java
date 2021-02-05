package com.example.demo.engineimpl;

import com.example.demo.context.IContext;
import com.example.demo.engine.AbstractProcessEngine;
import com.example.demo.pipeline.Pipeline;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhixin.wu
 * @date 2021/1/28 09:34
 */
public class DefaultProcessEngine extends AbstractProcessEngine<IContext> {

    @Setter
    private List<Pipeline> pipelineList;

    @Override
    public List<Pipeline> getPipelineList() {
        return pipelineList;
    }
}
