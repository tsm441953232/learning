package com.example.learn.eventTest.eventMonitor.impl;


import com.example.learn.eventTest.Event;
import com.example.learn.eventTest.eventMonitor.Event3Monitor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author jingchuan
 */
@Service
@Slf4j
public class Test5Event3MonitorImpl implements Event3Monitor {


    @Override
    public void event3Monitor(Event event) {
        log.info("Test5Event3MonitorImpl.event3Monitor:{}", event);
    }
}
