package cn.bdqn.service;

import cn.bdqn.pojo.AppInfo;
import cn.bdqn.util.PageSupport;

public interface AppInfoService {

    /**
     * 按照条件查询PageSupport
     * @param softwareName 软件名称(模糊查询)
     * @param status 状态
     * @param platformId 所属平台
     * @param categoryLevel1 1级分类
     * @param categoryLevel2 2级分类
     * @param categoryLevel3 3级分类
     * @param pageIndex 页码
     * @param pageSize 页面容量
     * @return APPInfo列表
     */
    PageSupport<AppInfo> findPageByCondition(String softwareName, Integer status, Integer platformId, Integer categoryLevel1,
                                             Integer categoryLevel2, Integer categoryLevel3, Integer pageIndex, Integer pageSize);
}
