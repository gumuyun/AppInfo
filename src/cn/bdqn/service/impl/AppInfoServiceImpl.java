package cn.bdqn.service.impl;

import cn.bdqn.dao.AppInfoMapper;
import cn.bdqn.pojo.AppInfo;
import cn.bdqn.service.AppInfoService;
import cn.bdqn.util.PageSupport;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AppInfoServiceImpl implements AppInfoService {

    @Resource
    private AppInfoMapper appInfoMapper;
    @Override
    public PageSupport<AppInfo> findPageByCondition(String softwareName, Integer status, Integer platformId, Integer categoryLevel1, Integer categoryLevel2, Integer categoryLevel3, Integer pageIndex, Integer pageSize) {
        PageSupport<AppInfo> pageSupport=new PageSupport<AppInfo>();
       //查询总数量
        int totalCount = appInfoMapper.count(softwareName, status, platformId, categoryLevel1, categoryLevel2, categoryLevel3);
        pageSupport.setTotalCount(totalCount);
        pageSupport.setPageSize(pageSize);
        pageSupport.setCurrentPageNo(pageIndex);
        if (totalCount>0){
            List<AppInfo> list = appInfoMapper.getPageByCondition(softwareName, status, platformId, categoryLevel1, categoryLevel2, categoryLevel3, pageSupport.getStartRow(), pageSize);
            pageSupport.setList(list);
        }
        return pageSupport;
    }
}
