package com.example.demo.config;

import com.example.demo.engineimpl.DefaultProcessEngine;
import com.example.demo.pipelineimpl.DefaultInjectPipeline;
import com.example.demo.pipelineimpl.DefaultOutputPipeline;
import com.example.demo.pipelineimpl.DefaultProcessPipeline;
import com.example.demo.wuzhixintest.WInject;
import com.example.demo.wuzhixintest.WOutput;
import com.example.demo.wuzhixintest.Wprocess;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author zhixin.wu
 * @date 2021/1/28 17:54
 */
@Configuration
public class JavaConfig {

    @Bean
    public WInject wInject() {
        return new WInject();
    }

    @Bean
    public DefaultInjectPipeline defaultInjectPipeline() {
        DefaultInjectPipeline defaultInjectPipeline = new DefaultInjectPipeline();
        defaultInjectPipeline.setProcessList(Arrays.asList(wInject()));
        return defaultInjectPipeline;
    }

    @Bean
    public Wprocess wprocess() {
        return new Wprocess();
    }

    @Bean
    public DefaultProcessPipeline defaultProcessPipeline() {
        DefaultProcessPipeline defaultProcessPipeline = new DefaultProcessPipeline();
        defaultProcessPipeline.setProcessList(Arrays.asList(wprocess()));
        return defaultProcessPipeline;
    }

    @Bean
    public WOutput wOutput() {
        return new WOutput();
    }

    @Bean
    public DefaultOutputPipeline defaultOutputPipeline() {
        DefaultOutputPipeline defaultOutputPipeline = new DefaultOutputPipeline();
        defaultOutputPipeline.setOutputList(Arrays.asList(wOutput()));
        return defaultOutputPipeline;
    }

    @Bean(value = "wzxDefaultProcessEngine")
    public DefaultProcessEngine defaultProcessEngine() {
        DefaultProcessEngine defaultProcessEngine = new DefaultProcessEngine();
        defaultProcessEngine.setPipelineList(Arrays.asList(defaultInjectPipeline(),
                 defaultProcessPipeline(), defaultOutputPipeline()));
        return defaultProcessEngine;
    }

}
