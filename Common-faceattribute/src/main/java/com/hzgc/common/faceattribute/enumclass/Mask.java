package com.hzgc.common.faceattribute.enumclass;

import com.hzgc.common.faceattribute.bean.Logistic;

import java.io.Serializable;

public enum Mask implements Serializable {

    HasMask(1), Nomask(0);

    private int value;

    /**
     * 与其他属性的拼接运算，默认是OR运算
     */
    private Logistic logistic = Logistic.OR;

    private Mask(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Logistic getLogistic() {
        return logistic;
    }

    public void setLogistic(Logistic logistic) {
        this.logistic = logistic;
    }

    public static Mask get(int maskvalue) {
        for (Mask mask : Mask.values()) {
            if (maskvalue == mask.getValue()) {
                return mask;
            }
        }
        return null;
    }

    /**
     * 获取属性描述
     *
     * @param mask 属性对象
     * @return 属性描述信息
     */
    public static String getDesc(Mask mask) {
        if (mask == Mask.HasMask) {
            return "有口罩";
        } else if (mask == Mask.Nomask) {
            return "没有口罩";
        }
        return null;
    }
}
