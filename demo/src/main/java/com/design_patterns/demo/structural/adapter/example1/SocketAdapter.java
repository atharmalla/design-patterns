package com.design_patterns.demo.structural.adapter.example1;

public interface SocketAdapter {

    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}