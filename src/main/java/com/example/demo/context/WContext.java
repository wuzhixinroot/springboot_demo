package com.example.demo.context;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhixin.wu
 * @date 2021/1/28 16:01
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WContext extends IContext {

    private String inject;
    private String process;
}
