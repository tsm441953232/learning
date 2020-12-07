package com.example.learn.eventTest.distribute;


import com.example.learn.eventTest.Event;
import com.example.learn.eventTest.eventMonitor.Event2Monitor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author jingchuan
 */
@Component
@Slf4j
public class Event2Distribute {

    @Autowired
    private List<Event2Monitor> event2Monitors;

    public void distributeEvent2(Event event) {
        if(event2Monitors != null && event2Monitors.size() > 0){
            event2Monitors.forEach(monitor -> {
                try {
                    monitor.event2Monitor(event);
                } catch (Exception e) {
                    log.error("Event2事件分发出现异常：", e);
                }
            });
        }
    }
}
