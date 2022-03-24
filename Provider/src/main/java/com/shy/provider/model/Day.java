package com.shy.provider.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author shyheng
 * @since 2022-03-23
 */
@ApiModel(value = "Day对象", description = "")
public class Day implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "day")
    private String day;

    private String msg1;

    private String msg2;

    private String msg3;

    private String msg4;

    private String msg5;

    private String msg6;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
    public String getMsg1() {
        return msg1;
    }

    public void setMsg1(String msg1) {
        this.msg1 = msg1;
    }
    public String getMsg2() {
        return msg2;
    }

    public void setMsg2(String msg2) {
        this.msg2 = msg2;
    }
    public String getMsg3() {
        return msg3;
    }

    public void setMsg3(String msg3) {
        this.msg3 = msg3;
    }
    public String getMsg4() {
        return msg4;
    }

    public void setMsg4(String msg4) {
        this.msg4 = msg4;
    }
    public String getMsg5() {
        return msg5;
    }

    public void setMsg5(String msg5) {
        this.msg5 = msg5;
    }
    public String getMsg6() {
        return msg6;
    }

    public void setMsg6(String msg6) {
        this.msg6 = msg6;
    }

    @Override
    public String toString() {
        return "Day{" +
            "day=" + day +
            ", msg1=" + msg1 +
            ", msg2=" + msg2 +
            ", msg3=" + msg3 +
            ", msg4=" + msg4 +
            ", msg5=" + msg5 +
            ", msg6=" + msg6 +
        "}";
    }
}
