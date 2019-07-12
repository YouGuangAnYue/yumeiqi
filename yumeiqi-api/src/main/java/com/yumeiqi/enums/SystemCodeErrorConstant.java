package com.yumeiqi.enums;

import com.yumeiqi.beans.common.Result;

public enum SystemCodeErrorConstant {

    SUCCESS(200,"success"),
    FALL(1000,"未知错误") ,
    PARAM_ERROR(10001,"参数错误"),
    DATABASE_ERROE(10002,"数据库异常");

    SystemCodeErrorConstant(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private Integer code ;
    private String message ;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result getResult(){
        return new Result(this.code,this.message) ;
    }

}
