package com.javaman.event;

/**
 * @author pengzhe
 * @date 2019-05-10 23:32
 * @description 定义监听接口的实现, 如何处理
 */

public class AbstractMethodMonitorEventListener implements MethodMonitorEventListener {

    public void onMethodBegin(MethodMonitorEvent event) {
        //记录方法开始执行的时间
        event.timestamp = System.currentTimeMillis();
    }

    public void onMethodEnd(MethodMonitorEvent event) {
        //记录方法耗时
        long duration = System.currentTimeMillis() - event.timestamp;
        System.out.println("方法耗时:" + duration);
    }
}
