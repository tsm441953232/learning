package com.example.learn.eventTest.distribute;


import com.example.learn.eventTest.Event;
import com.example.learn.eventTest.eventMonitor.Event3Monitor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author jingchuan
 */
@Component
@Slf4j
public class Event3Distribute {

    @Autowired
    private List<Event3Monitor> event3Monitors;

    public void distributeEvent3(Event event) {
        if(event3Monitors != null && event3Monitors.size() > 0){
            event3Monitors.forEach(monitor -> {
                try {
                    monitor.event3Monitor(event);
                } catch (Exception e) {
                    log.error("Event3事件分发出现异常：", e);
                }
            });
        }
    }
}
