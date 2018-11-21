package com.dxc.excel.service;

import com.dxc.excel.model.BasicInfo;
import org.springframework.stereotype.Service;

public interface BasicInfoService {
    BasicInfo getUserBasicInfoByIdCard(String idcard);
}
