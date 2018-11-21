package com.dxc.excel.web;
import com.dxc.excel.model.BasicInfo;
import com.dxc.excel.response.Response;
import com.dxc.excel.response.ResponseData;
import com.dxc.excel.service.BasicInfoService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/basic")
public class BasicInfoController {
    @Resource
    private BasicInfoService basicInfoService;

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public Response login(String idcard){
        BasicInfo bi = basicInfoService.getUserBasicInfoByIdCard(idcard);
        return ResponseData.success(bi);
    }
}
