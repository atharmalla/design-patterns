package com.design_patterns.demo.creational.builder.example1;


public class ComputerClient {

    public static void main(String[] args) {

        Computer comp = new Computer.Builder("2GB", "2TB", "Intel i7").build();

        Computer comp1 = new Computer.Builder("2GB", "2TB", "Intel i7").setGraphicsCardEnabled(true).build();

    }

}