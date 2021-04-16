package com.sm.qy28.common.http;


import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AxiosResult<T>{

    private int status;
    private String message;
    private T data;


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public AxiosResult(EnumStatus enumStatus, T data) {
        this.status = enumStatus.getStatus();
        this.message = enumStatus.getMessage();
        this.data = data;
    }

    private static  <T> AxiosResult<T> getAxiosResult(EnumStatus enumStatus, T data){
        return new AxiosResult<T>(enumStatus,data);
    }


    /**
     * 返回成功并携带数据
     */

    public static <T> AxiosResult<T> success(T data){
        return getAxiosResult(EnumStatus.OK,data);
    }


    /**
     * 返回失败并携带数据
     */

    public static <T> AxiosResult<T> error(T data){
        return getAxiosResult(EnumStatus.ERROR,data);
    }

    /**
     * 自定义其他状态
     */

    public static <T> AxiosResult<T> success(EnumStatus enumStatus,T data){
        return getAxiosResult(enumStatus,data);
    }

    public static <T> AxiosResult<T> error(EnumStatus enumStatus,T data){
        return getAxiosResult(enumStatus,data);
    }


}

