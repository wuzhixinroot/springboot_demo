package com.example.demo.pipelineimpl;

import com.example.demo.context.IContext;
import com.example.demo.pipeline.AbstractProcessPipeline;
import com.example.demo.plugin.Process;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhixin.wu
 * @date 2021/1/27 18:07
 */
public class DefaultProcessPipeline extends AbstractProcessPipeline<IContext, Process> {

    @Setter
    private List<Process> processList;

    @Override
    public List getProcessList() {
        return processList;
    }
}
