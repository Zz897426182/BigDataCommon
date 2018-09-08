package com.hzgc.jni;

import java.io.Serializable;
import java.util.Arrays;

public class FaceAttribute implements Serializable {
    private float[] feature;    // 特征值
    private int gender;         // 性别
    private int huzi;           // 是否胡子
    private int mask;           // 是否口罩
    private int eyeglasses;     // 是否戴眼镜
    private int age;             //实际年龄
    private int sharpness;      //清晰为0，不清晰为1

    public float[] getFeature() {
        return feature;
    }

    public void setFeature(float[] feature) {
        this.feature = feature;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getHuzi() {
        return huzi;
    }

    public void setHuzi(int huzi) {
        this.huzi = huzi;
    }

    public int getEyeglasses() {
        return eyeglasses;
    }

    public void setEyeglasses(int eyeglasses) {
        this.eyeglasses = eyeglasses;
    }

    public int getMask() {
        return mask;
    }

    public void setMask(int mask) {
        this.mask = mask;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSharpness() {
        return sharpness;
    }

    public void setSharpness(int sharpness) {
        this.sharpness = sharpness;
    }

    @Override
    public String toString() {
        return "FaceAttribute{" +
                "feature=" + Arrays.toString(feature) +
                ", gender=" + gender +
                ", huzi=" + huzi +
                ", mask=" + mask +
                ", eyeglasses=" + eyeglasses +
                ", age=" + age +
                '}';
    }
}
