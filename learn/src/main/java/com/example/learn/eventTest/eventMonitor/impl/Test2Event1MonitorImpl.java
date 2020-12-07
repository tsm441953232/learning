package com.example.learn.eventTest.eventMonitor.impl;

import com.example.learn.eventTest.Event;
import com.example.learn.eventTest.eventMonitor.Event1Monitor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author jingchuan
 */
@Service
@Slf4j
public class Test2Event1MonitorImpl implements Event1Monitor {

    @Override
    public void event1Monitor(Event event) {
        log.info("Test2Event1MonitorImpl.event1Monitor:{}", event);
    }
}
