package com.example.demo.context;

import com.example.demo.result.FlowResult;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhixin.wu
 * @date 2021/1/27 17:06
 */

@Data
@NoArgsConstructor
public abstract class IContext {

    private static final long serialVersionUID = 3231014009770270585L;

    /**
     * 流程处理结果
     */
    private FlowResult flowResult;
}
