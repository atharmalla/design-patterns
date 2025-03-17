package com.design_patterns.demo.structural.adapter.example1;


public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}