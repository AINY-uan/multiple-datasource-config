package org.ainy.entity.authority;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
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
    @NotEmpty(message = "登录id不能为空")
    private String userId;
    @NotEmpty(message = "用户名不能为空")
    private String userName;
    private String salt;
    private String hashValue;
    @NotEmpty(message = "角色类型不能为空")
    private String roleId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createTime;
}
