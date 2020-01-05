package org.ainy.controller.authority;

import lombok.extern.slf4j.Slf4j;
import org.ainy.constant.ErrorConstant;
import org.ainy.entity.authority.User;
import org.ainy.model.ResponseData;
import org.ainy.service.authority.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author 阿拉丁省油的灯
 * @Date 2019-11-06 22:38
 * @Description 用户控制类
 */
@Slf4j
@RestController
@RequestMapping(value = "/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ResponseBody
    @GetMapping(value = "/getUserInfo/{uid}")
    public ResponseData getUserInfo(@PathVariable("uid") String uid) {

        try {
            User user = new User();
            user.setUid(Long.valueOf(uid));
            return new ResponseData<>(userService.selectByPrimaryKey(user));
        } catch (Exception e) {
            log.error("[系统错误]", e);
            return new ResponseData(ErrorConstant.SYSTEM_ERROR.getCode(), ErrorConstant.SYSTEM_ERROR.getDesc());
        }
    }

    @ResponseBody
    @PostMapping(value = "/create")
    public ResponseData createUser(@RequestBody User user) {

        try {

            return new ResponseData<>(userService.insert(user));
        } catch (Exception e) {
            log.error("[系统错误]", e);
            return new ResponseData(ErrorConstant.SYSTEM_ERROR.getCode(), ErrorConstant.SYSTEM_ERROR.getDesc());
        }
    }
}
