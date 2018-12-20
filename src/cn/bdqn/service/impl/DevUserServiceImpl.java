package cn.bdqn.service.impl;

import cn.bdqn.dao.DevUserMapper;
import cn.bdqn.pojo.DevUser;
import cn.bdqn.service.DevUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DevUserServiceImpl implements DevUserService {

    @Resource
    private DevUserMapper devUserMapper;

    @Override
    public DevUser login(String devCode, String devPassword) {
        return devUserMapper.getLoginUser(devCode,devPassword);
    }
}
