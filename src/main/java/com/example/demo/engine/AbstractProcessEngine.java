package com.example.demo.engine;

import com.example.demo.context.IContext;
import com.example.demo.pipeline.Pipeline;
import com.example.demo.result.FlowResult;

import java.util.List;

/**
 * @author zhixin.wu
 * @date 2021/1/28 09:12
 */
public abstract class AbstractProcessEngine<I extends IContext> implements Engine<I> {

    private FlowResult flowResult;
    @Override
    public FlowResult process(IContext context) {

        try {
            for (int i = 0; i < getPipelineList().size(); i++) {
                Pipeline pipeline = getPipelineList().get(i);
                pipeline.execute(context);
            }

            flowResult = context.getFlowResult();
        }catch (Exception e) {

        }
        return flowResult;
    }
    public abstract List<Pipeline> getPipelineList();
}
