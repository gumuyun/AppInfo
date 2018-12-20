package cn.bdqn.dao;

import cn.bdqn.pojo.DevUser;
import org.apache.ibatis.annotations.Param;

public interface DevUserMapper {
    DevUser getLoginUser(@Param("devCode") String devCode, @Param("devPassword")String devPassword);
}
