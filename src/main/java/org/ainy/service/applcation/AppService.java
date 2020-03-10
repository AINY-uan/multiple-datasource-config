package org.ainy.service.applcation;

import lombok.extern.slf4j.Slf4j;
import org.ainy.dao.mapper.application.AppsMaper;
import org.ainy.entity.application.Apps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 阿拉丁省油的灯
 * @date 2019-11-09 21:23
 * @description 应用服务
 */
@Slf4j
@Service
public class AppService {

    private final AppsMaper appsMaper;

    @Autowired
    public AppService(AppsMaper appsMaper) {
        this.appsMaper = appsMaper;
    }

    public Apps selectByPrimaryKey(Object o) {

        return appsMaper.selectByPrimaryKey(o);
    }
}
