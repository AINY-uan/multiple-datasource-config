package org.ainy.constant;

/**
 * @author 阿拉丁省油的灯
 * @date 2019-11-09 21:46
 * @description 错误码枚举类
 */
public enum ErrorConstant {

    /**
     * 成功
     */
    SYSTEM_SUCCESS(200, "成功"),
    /**
     * 系统错误
     */
    SYSTEM_ERROR(500, "系统错误"),

    ;

    private Integer code;
    private String desc;

    ErrorConstant(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
