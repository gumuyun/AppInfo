package cn.bdqn.service;

import cn.bdqn.pojo.DevUser;

public interface DevUserService {

    DevUser login(String devCode,String devPassword);
}
