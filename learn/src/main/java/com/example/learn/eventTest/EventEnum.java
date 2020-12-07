package com.example.learn.eventTest;

import lombok.Getter;

import java.util.Objects;

/**
 * 事件枚举
 * @author jingchuan
 */
@Getter
public enum EventEnum {

    EVENT1(1, "事件1"),
    EVENT2(2, "事件2"),
    EVENT3(3, "事件3"),
    EVENT4(4, "事件4"),
    EVENT5(5, "事件5"),
    ;

    private Integer code;

    private String desc;

    EventEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static EventEnum valueOf(Integer code){
        for(EventEnum eventEnum : EventEnum.values()){
            if(Objects.equals(code, eventEnum.getCode())){
                return eventEnum;
            }
        }
        return null;
    }

}
