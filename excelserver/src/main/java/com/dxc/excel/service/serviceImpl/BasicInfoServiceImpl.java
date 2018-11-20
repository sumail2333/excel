package com.dxc.excel.service.serviceImpl;

import com.dxc.excel.mapper.BasicInfoMapper;
import com.dxc.excel.model.BasicInfo;
import com.dxc.excel.service.BasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;

public class BasicInfoServiceImpl implements BasicInfoService {
    @Autowired
    private BasicInfoMapper basicInfoMapper;
    @Override
    public BasicInfo getUserBasicInfoByIdCard(String idcard) {
        return null;
    }
}
