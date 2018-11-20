package com.dxc.excel.service;

import com.dxc.excel.model.BasicInfo;

public interface BasicInfoService {
    BasicInfo getUserBasicInfoByIdCard(String idcard);
}
