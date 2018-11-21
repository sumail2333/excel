package com.dxc.excel.mapper;

import com.dxc.excel.model.BasicInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface BasicInfoMapper {
    int insert(BasicInfo record);

    int insertSelective(BasicInfo record);

    BasicInfo getUserBasicInfoByIdCard(String idcard);
}