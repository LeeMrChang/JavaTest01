package com.itheima._Demo08;

public class BaoZi {
    /**
     * 定义一个变量来记录是否有包子
     *
     */
    String pier;
    String xianer;
     boolean result = false;//一开始是没有包子

    public BaoZi() {
    }

    public BaoZi(String pier, String xianer, boolean result) {
        this.pier = pier;
        this.xianer = xianer;
        this.result = result;
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

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
