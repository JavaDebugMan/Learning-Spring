package com.javaman.event;

import java.util.EventListener;

/**
 * @author pengzhe
 * @date 2019-05-10 23:28
 * @description 定义事件监听接口
 * 事件监听器接口针对不同的事件发布实际提供相应的处理方法定义,最重要的是,
 * 其方法只接收MethodMonitorEvent参数,说明这个监听器只负责监听器对应的事件并进行处理
 */

public interface MethodMonitorEventListener extends EventListener {

    void onMethodBegin(MethodMonitorEvent event);

    void onMethodEnd(MethodMonitorEvent event);

}
