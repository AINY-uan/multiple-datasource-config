package org.ainy.dao.mapper.application;

import org.ainy.entity.application.Apps;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

/**
 * @author 阿拉丁省油的灯
 * @date 2019-11-06 22:33
 * @description 应用映射
 */
@Mapper
@Repository
public interface AppsMaper {

    /**
     * 根据主键查询信息
     *
     * @param o 查询条件
     * @return 信息
     * @throws DataAccessException DataAccessException
     */
    @Select("select id, app_name, app_type, create_time, modify_time from application.apps")
    Apps selectByPrimaryKey(Object o) throws DataAccessException;
}
