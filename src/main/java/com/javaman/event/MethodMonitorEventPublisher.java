package com.javaman.event;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author pengzhe
 * @date 2019-05-10 23:37
 * @description 事件发布者(事件源)
 * <p>
 * 1:在合适的时间发布事件,此例中的methodMonitor方法是时间发布的源头,
 * 其在方法执行之前和结束之后的两个时间点发布MethodMonitorEvent事件,
 * 每个时间点发布的事件都会传给相应的监听器进行处理,在具体实现时需要注意的是,
 * 事件发布是顺序执行,为了不影响处理性能,时间监听器的处理逻辑应尽量简单
 * <p>
 * 2:事件监听器的处理,publisher类中提供了事件监听器的注册和移除方法,
 * 这样客户端可以根据实际情况决定是否需要注册新的监听器或者移除某个监听器,
 * 如果这里没有remove方法,那么注册的监听器实例将一直被MethodMonitorEventPublisher引用
 * 即使已经废弃不用,也依然在发布者的监听器列表中,这回导致隐性的内存泄漏
 */

public class MethodMonitorEventPublisher {

    private List<MethodMonitorEventListener> listeners = new ArrayList<MethodMonitorEventListener>();

    public void methodMonitor() throws InterruptedException {
        MethodMonitorEvent event = new MethodMonitorEvent(this);
        publishEvent("begin", event);
        //模拟方法执行,休眠5秒
        TimeUnit.SECONDS.sleep(5);
        publishEvent("end", event);
    }

    private void publishEvent(String status, MethodMonitorEvent event) {
        List<MethodMonitorEventListener> copyListeners = new ArrayList<MethodMonitorEventListener>(listeners);
        for (MethodMonitorEventListener listener : copyListeners) {
            if ("begin".equalsIgnoreCase(status)) {
                listener.onMethodBegin(event);
            } else {
                listener.onMethodEnd(event);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MethodMonitorEventPublisher publisher = new MethodMonitorEventPublisher();
        publisher.addEventListener(new AbstractMethodMonitorEventListener());
        publisher.methodMonitor();
    }


    public void addEventListener(MethodMonitorEventListener listener) {
        listeners.add(listener);
    }

    public void removeListener(MethodMonitorEventListener listener) {
        listeners.remove(listener);
    }

    public void removeAllListeners() {
    }

}
