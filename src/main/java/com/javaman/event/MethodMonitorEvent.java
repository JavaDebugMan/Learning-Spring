package com.javaman.event;

import java.util.EventObject;

/**
 * @author pengzhe
 * @date 2019-05-10 23:25
 * @description
 */

public class MethodMonitorEvent extends EventObject {


    // 时间戳，用于记录方法开始执行的时间
    public long timestamp;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public MethodMonitorEvent(Object source) {
        super(source);
    }
}
