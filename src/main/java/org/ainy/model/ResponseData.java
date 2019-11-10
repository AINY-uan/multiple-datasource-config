package org.ainy.model;

import lombok.Data;

/**
 * @Author 阿拉丁省油的灯
 * @Date 2019-11-06 22:40
 * @Description 响应数据Model
 */
@Data
public class ResponseData<T> {

    private Integer code;
    private Boolean status;
    private String message;
    private T data;

    public ResponseData(Integer code, String message) {
        this.code = code;
        this.status = false;
        this.message = message;
    }

    public ResponseData(T data) {
        this.code = 200;
        this.status = true;
        this.message = "success";
        this.data = data;
    }
}
