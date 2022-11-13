package com.springlearning.entity;


import lombok.Data;

import java.util.Map;

@Data
public class EmailEntity {
    private String to;
    private String from;
    private String subject;
    private String content;
    private Map< String, Object > model;

}
