package com.example.learn.eventTest.eventMonitor.impl;


import com.example.learn.eventTest.Event;
import com.example.learn.eventTest.eventMonitor.Event2Monitor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author jingchuan
 */
@Service
@Slf4j
public class Test4Event2MonitorImpl implements Event2Monitor {


    @Override
    public void event2Monitor(Event event) {
        log.info("Test4Event2MonitorImpl.event2Monitor:{}", event);
    }
}
