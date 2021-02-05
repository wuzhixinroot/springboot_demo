package com.example.demo.result;

/**
 * @author zhixin.wu
 * @date 2021/1/28 10:54
 */
public class ErrorCode {
    private int code;
    private String message;

    public ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}

