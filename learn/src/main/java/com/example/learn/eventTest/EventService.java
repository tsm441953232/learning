package com.example.learn.eventTest;

/**
 * 事件入口
 */
public interface EventService {

    /**
     * 通知事件
     * @param event
     * @return
     */
    Boolean notifyEvent(Event event);
}
