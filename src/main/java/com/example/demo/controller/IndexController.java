package com.example.demo.controller;

import com.example.demo.context.IContext;
import com.example.demo.context.WContext;
import com.example.demo.engineimpl.DefaultProcessEngine;
import com.example.demo.result.FlowResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author zhixin.wu
 * @date 2021/1/29 14:53
 */
@Controller
public class IndexController {


    @Resource
    private DefaultProcessEngine defaultProcessEngine;

    @RequestMapping("/wuzhixin")
    @ResponseBody
    public FlowResult getResult() {
        IContext context = new WContext();
        FlowResult process = defaultProcessEngine.process(context);
        System.out.println(process.getData());
        return process;
    }
}
