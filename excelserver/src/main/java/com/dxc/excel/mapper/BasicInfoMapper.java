package com.dxc.excel.mapper;

import com.dxc.excel.model.BasicInfo;

public interface BasicInfoMapper {
    int insert(BasicInfo record);

    int insertSelective(BasicInfo record);
}