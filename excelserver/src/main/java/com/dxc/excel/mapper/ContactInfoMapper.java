package com.dxc.excel.mapper;

import com.dxc.excel.model.ContactInfo;

public interface ContactInfoMapper {
    int insert(ContactInfo record);

    int insertSelective(ContactInfo record);
}