package com.springlearning.model;

import lombok.Data;

import java.util.Map;
@Data
public class EmailModel {
    String to;
    String from;
    String subject;
    String content;
    private Map< String, Object > model;
    String firstName;
    String watchers;
    String doctor;
}
