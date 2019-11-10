package org.ainy.dao.mapper.application;

import org.ainy.entity.application.Apps;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

/**
 * @Author 阿拉丁省油的灯
 * @Date 2019-11-06 22:33
 * @Description 应用映射
 */
@Mapper
@Repository
public interface AppsMaper {

    @Select("select id, app_name, app_type, create_time, modify_time from application.apps")
    Apps selectByPrimaryKey(Object o) throws DataAccessException;
}
