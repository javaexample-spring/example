package com.netease.example.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MyResponseContent<T> {

    private boolean success;

    private T data;

    private String message;

    private int code;

    public MyResponseContent(boolean success, T data, String message){
        this.success = success;
        this.data = data;
        this.message = message;
    }
}
