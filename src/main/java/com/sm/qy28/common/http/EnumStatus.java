package com.sm.qy28.common.http;

public enum EnumStatus {
    OK(2000,"操作成功"),
    ERROR(4000,"操作失败"),
    USERNAME_ERROR(4004,"用户名错误"),
    PASSWORD_ERROR(4000,"密码错误"),
    NO_LOGIN(4002,"未登录"),
    ;

    private int Status;
    private String message;

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    EnumStatus(int status, String message) {
        Status = status;
        this.message = message;
    }
}

