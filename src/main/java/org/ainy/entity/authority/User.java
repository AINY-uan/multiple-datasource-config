package org.ainy.entity.authority;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Author 阿拉丁省油的灯
 * @Date 2019-11-06 22:29
 * @Description 用户实体类
 */
@Data
@NoArgsConstructor
public class User {

    private Long uid;
    private String userId;
    private String userName;
    private String salt;
    private String hashValue;
    private String roleId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createTime;
}
