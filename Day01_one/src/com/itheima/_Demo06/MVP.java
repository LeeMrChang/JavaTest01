package com.itheima._Demo06;

import java.util.Iterator;

public class MVP<MVP> {
    //没有MVP类型，在这里代表 未知的一种数据类型，未来传递什么就是什么类型
    private MVP mvp;

    public MVP getMvp() {
        return mvp;
    }

    public void setMvp(MVP mvp) {
        this.mvp = mvp;
    }
    public <MVP> void show(MVP mvp){
        System.out.println(mvp.getClass());
    }

    public <MVP> MVP show2(MVP mvp){
        return mvp;
    }
}
