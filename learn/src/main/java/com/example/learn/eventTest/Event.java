package com.example.learn.eventTest;

import lombok.Data;

import java.io.Serializable;

/**
 * @author jingchuan
 */
@Data
public class Event implements Serializable {

    private static final long serialVersionUID = 5765491973379899960L;

    /**
     * 事件发生时间
     */
    private Long eventTime;

    /**
     * 事件code
     * @see EventEnum
     */
    private Integer eventCode;

    /**
     * 事件json数据
     */
    private String eventJson;

}
