package io.mosn.layotto.preview.domain;


import java.io.Serializable;

public class ResultData<T> implements Serializable {
    public static final String OK = "0000";
    public static final String OK_MSG = "success";
    public static final String ERR = "9999";
    public static final String ERR_MSG = "fail";
    private static final long serialVersionUID = 1L;
    private String code = ERR;
    private String msg = "";
    private T data;

    public ResultData() {
    }

    public ResultData(String code, String message) {
        this.code = code;
        this.msg = message;
    }

    public ResultData(String code, String message, T result) {
        this.code = code;
        this.msg = message;
        this.data = result;
    }

    public ResultData(T result) {
        this(OK, OK_MSG, result);
    }

    public static ResultData getFailResult() {
        return new ResultData(ERR, ERR_MSG);
    }

    public static ResultData getFailResult(String message) {

        return new ResultData(ERR, message);
    }

    public static ResultData getFailResult(String code, String message) {
        return new ResultData(code, message);
    }

    public static ResultData getSuccessResult() {
        return new ResultData(OK, OK_MSG);
    }

    public static ResultData getSuccessResult(String message) {
        return new ResultData(OK, message);
    }

    public static <T> ResultData getSuccessData(T data) {
        return new ResultData(OK, OK_MSG, data);
    }

    public static <T> ResultData getSuccessResult(T data, String message) {
        return new ResultData(OK, message, data);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultData{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}