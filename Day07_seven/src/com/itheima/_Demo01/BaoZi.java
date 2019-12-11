package com.itheima._Demo01;

public class BaoZi {
    //包子皮
    String pier;
    //包子馅
     String xianer;
    //代表有没有做包子的资源
   boolean falg;

    public BaoZi() {
    }

    public BaoZi(String pier, String xianer, boolean falg) {
        this.pier = pier;
        this.xianer = xianer;
        this.falg = falg;
    }

    public String getPier() {
        return pier;
    }

    public void setPier(String pier) {
        this.pier = pier;
    }

    public String getXianer() {
        return xianer;
    }

    public void setXianer(String xianer) {
        this.xianer = xianer;
    }

    public boolean isFalg() {
        return falg;
    }

    public void setFalg(boolean falg) {
        this.falg = falg;
    }

    @Override
    public String toString() {
        return "BaoZi{" +
                "pier='" + pier + '\'' +
                ", xianer='" + xianer + '\'' +
                ", falg=" + falg +
                '}';
    }
}
