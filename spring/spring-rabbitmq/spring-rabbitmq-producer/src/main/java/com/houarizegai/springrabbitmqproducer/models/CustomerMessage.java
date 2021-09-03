package com.houarizegai.springrabbitmqproducer.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class CustomerMessage {

    private String messageId;
    private String message;
    private Date messageDate;
}
