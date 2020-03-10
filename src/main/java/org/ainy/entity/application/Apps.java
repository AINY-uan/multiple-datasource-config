package org.ainy.entity.application;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author 阿拉丁省油的灯
 * @date 2019-11-06 22:34
 * @description 应用实体类
 */
@Data
@NoArgsConstructor
public class Apps {

    private Long id;
    private String appName;
    private String appType;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;
}
