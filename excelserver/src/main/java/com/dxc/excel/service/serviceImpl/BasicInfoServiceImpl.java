package com.dxc.excel.service.serviceImpl;

import com.dxc.excel.mapper.BasicInfoMapper;
import com.dxc.excel.model.BasicInfo;
import com.dxc.excel.service.BasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("basicInfoService")
@Transactional
public class BasicInfoServiceImpl implements BasicInfoService {
    @Resource
    private BasicInfoMapper basicInfoMapper;
    @Override
    public BasicInfo getUserBasicInfoByIdCard(String idcard) {
        return basicInfoMapper.getUserBasicInfoByIdCard(idcard);
    }
}
