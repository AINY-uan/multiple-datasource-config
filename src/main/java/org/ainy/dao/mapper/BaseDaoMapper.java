package org.ainy.dao.mapper;

import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * @author 阿拉丁省油的灯
 * @date 2019-03-31 10:53
 * @description 公共映射Mapper
 */
public interface BaseDaoMapper {


    /**
     * 根据主键查询
     */
    <T> T selectByPrimaryKey(Object object) throws DataAccessException;

    /**
     * 根据条件查询记录条数
     */
    int selectCount(Object object) throws DataAccessException;

    /**
     * 分页查询
     */
    List<Object> selectByPage(Object object) throws DataAccessException;

    /**
     * 插入
     */
    int insert(Object object) throws DataAccessException;

    /**
     * 根据主键更新
     */
    int update(Object object) throws DataAccessException;

    /**
     * 根据主键删除
     */
    int delete(Object object) throws DataAccessException;
}
