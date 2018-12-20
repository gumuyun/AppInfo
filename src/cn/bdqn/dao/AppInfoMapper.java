package cn.bdqn.dao;

import cn.bdqn.pojo.AppInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppInfoMapper {
    /**
     * 按照条件查询APPInfo列表
     * @param softwareName 软件名称(模糊查询)
     * @param status 状态
     * @param platformId 所属平台
     * @param categoryLevel1 1级分类
     * @param categoryLevel2 2级分类
     * @param categoryLevel3 3级分类
     * @param startRow 起始行
     * @param pageSize 页面容量
     * @return APPInfo列表
     */
    List<AppInfo> getPageByCondition(@Param("softwareName") String softwareName,
                                     @Param("status")Integer status,
                                     @Param("platformId")Integer platformId,
                                     @Param("categoryLevel1")Integer categoryLevel1,
                                     @Param("categoryLevel2")Integer categoryLevel2,
                                     @Param("categoryLevel3")Integer categoryLevel3,
                                     @Param("startRow")Integer startRow,
                                     @Param("pageSize")Integer pageSize);

    /**
     *
     * 按照条件查询APPInfo总数量
     *      * @param softwareName 软件名称(模糊查询)
     *      * @param status 状态
     *      * @param platformId 所属平台
     *      * @param categoryLevel1 1级分类
     *      * @param categoryLevel2 2级分类
     *      * @param categoryLevel3 3级分类
     * @return
     */
    int count(@Param("softwareName") String softwareName,
              @Param("status")Integer status,
              @Param("platformId")Integer platformId,
              @Param("categoryLevel1")Integer categoryLevel1,
              @Param("categoryLevel2")Integer categoryLevel2,
              @Param("categoryLevel3")Integer categoryLevel3);
}
