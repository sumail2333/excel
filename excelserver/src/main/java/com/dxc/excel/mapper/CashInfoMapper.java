package com.dxc.excel.mapper;

import com.dxc.excel.model.CashInfo;

public interface CashInfoMapper {
    int insert(CashInfo record);

    int insertSelective(CashInfo record);
}