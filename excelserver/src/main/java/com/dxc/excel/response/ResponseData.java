package com.dxc.excel.response;

public class ResponseData {
    public static Response success(Object object,String message){
        Response response = new Response();
        response.setCode(ResponseEnum.SUCCESS.getCode());
        response.setMsg(message);
        response.setData(object);
        return response;
    }
    public static Response success(Object object){
        Response response = new Response();
        response.setCode(ResponseEnum.SUCCESS.getCode());
        response.setMsg(ResponseEnum.SUCCESS.getMsg());
        response.setData(object);
        return response;
    }
    public static Response error(int code, String msg){
        Response response = new Response();
        response.setCode(code);
        response.setMsg(msg);
        return response;
    }
}
