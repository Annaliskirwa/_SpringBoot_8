package com.example.Apache_Activemq.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Product implements Serializable {
    private int productId;
    private String name;
    private int quantity;
}
