package com.plugin.collect.response;

public class CustomResponseEntity {
    private int code;
    private String message;
    private Object data;
    public CustomResponseEntity() {
    }
    public CustomResponseEntity(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "CustomResponseEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
    public static CustomResponseEntity success(Object data) {
        return new CustomResponseEntity(200, "success", data);
    }
    public static CustomResponseEntity success() {
        return new CustomResponseEntity(200, "success", null);
    }
    public static CustomResponseEntity fail(String message) {
        return new CustomResponseEntity(500, message, null);
    }
    public static CustomResponseEntity fail(int code, String message) {
        return new CustomResponseEntity(code, message, null);
    }
    public static CustomResponseEntity fail(int code, String message, Object data) {
        return new CustomResponseEntity(code, message, data);
    }
    public static CustomResponseEntity fail(String message, Object data) {
        return new CustomResponseEntity(500, message, data);
    }
}
