package com.example.learn.eventTest.distribute;


import com.example.learn.eventTest.Event;
import com.example.learn.eventTest.eventMonitor.Event1Monitor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author jingchuan
 */
@Component
@Slf4j
public class Event1Distribute {

    @Autowired
    private List<Event1Monitor> event1Monitors;

    public void distributeEvent1(Event event) {
        if(event1Monitors != null && event1Monitors.size() > 0){
            event1Monitors.forEach(monitor -> {
                try {
                    monitor.event1Monitor(event);
                } catch (Exception e) {
                    log.error("Event1事件分发出现异常：", e);
                }
            });
        }
    }
}
