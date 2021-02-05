package com.example.demo.result;

/**
 * @author zhixin.wu
 * @date 2021/1/28 10:53
 */


import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.text.MessageFormat;

/**
 * @Author : jianghengwei
 * @Date :Created by 2017/10/31 下午8:41.
 * @Description :
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlowResult<T> implements Serializable {

    private static final int REST_SUCCESS_CODE = 0;

    private String message = "success";
    /**
     * 默认是false，即-1，成功是0
     */
    private int code = -1;

    private T data;

    private Boolean success;

    public FlowResult(T data) {
        this.data = data;
    }

    public FlowResult(ErrorCode errorCode) {

        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();

        if(code == REST_SUCCESS_CODE){
            this.success = true;
        }
    }

    public FlowResult(int code, String message) {

        this.code = code;
        this.message = message;

        if(code == REST_SUCCESS_CODE){
            this.success = true;
        }
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
        if(code == REST_SUCCESS_CODE){
            this.success = true;
        }
    }

    public boolean isSuccess() {
        if(REST_SUCCESS_CODE == this.code && this.success){
            return true;
        }else{
            return false;
        }
    }

    public void setSuccess(Boolean success){
        this.success = success;
        if(success){
            this.code = REST_SUCCESS_CODE;
        }else{
            this.code = -1;
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> FlowResult<T> buildSuccessResult(T data) {
        FlowResult flowResult = new FlowResult<>();
        flowResult.setSuccess(true);
        flowResult.setData(data);
        return flowResult;
    }

    public static <T> FlowResult<T> buildFailResult(ErrorCode errorCode) {
        FlowResult flowResult = new FlowResult();
        flowResult.setSuccess(false);
        flowResult.setCode(errorCode.getCode());
        flowResult.setMessage(errorCode.getMessage());
        return flowResult;
    }

    public static <T> FlowResult<T> buildFailResult(ErrorCode errorCode, T data) {
        FlowResult flowResult = new FlowResult();
        flowResult.setSuccess(false);
        flowResult.setCode(errorCode.getCode());
        flowResult.setMessage(errorCode.getMessage());
        flowResult.setData(data);
        return flowResult;
    }

    public static <T> FlowResult<T> buildFailResult(ErrorCode errorCode, Object... args) {
        FlowResult flowResult = new FlowResult();
        flowResult.setSuccess(false);
        flowResult.setCode(errorCode.getCode());
        flowResult.setMessage(MessageFormat.format(errorCode.getMessage(), args));
        return flowResult;
    }

    @Override
    public String toString() {
        return "FlowResult {" +
                "message='" + message + '\'' +
                ", code=" + code +
                ", data=" + JSON.toJSONString(data) +
                '}';
    }
}

