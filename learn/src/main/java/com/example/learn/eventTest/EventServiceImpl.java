package com.example.learn.eventTest;


import com.example.learn.eventTest.distribute.Event1Distribute;
import com.example.learn.eventTest.distribute.Event2Distribute;
import com.example.learn.eventTest.distribute.Event3Distribute;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * 各类 事件转发器
 * @author jingchuan
 */
@Service
@Slf4j
public class EventServiceImpl implements EventService {

    /**
     * 事件分发器 调度Map
     * 事件能被分配到各自的事件分发器  需要在这里注册
     */
    private static Map<Integer, Consumer<Event>> eventDispatcher = new HashMap<>();

    @Autowired
    private Event1Distribute event1Distribute;

    @Autowired
    private Event2Distribute event2Distribute;

    @Autowired
    private Event3Distribute event3Distribute;

    @PostConstruct
    public void initEventDispatcher(){
        //EVENT1事件分发器
        eventDispatcher.put(EventEnum.EVENT1.getCode(), event1Distribute::distributeEvent1);
        //EVENT2事件分发器
        eventDispatcher.put(EventEnum.EVENT2.getCode(), event2Distribute::distributeEvent2);
        //EVENT3事件分发器
        eventDispatcher.put(EventEnum.EVENT3.getCode(), event3Distribute::distributeEvent3);
    }

    @Override
    public Boolean notifyEvent(Event event){
        log.info("收到事件：{}", event);
        if(event == null || event.getEventCode() == null){
            return false;
        }
        Consumer<Event> eventConsumer = eventDispatcher.get(event.getEventCode());
        if(eventConsumer == null){
            log.error("事件未匹配到事件驱动器:{}", event);
            return false;
        }
        try {
            eventConsumer.accept(event);
            return true;
        } catch (Exception e) {
            log.error("事件驱动过程出现异常：", e);
        }
        return false;
    }

}
