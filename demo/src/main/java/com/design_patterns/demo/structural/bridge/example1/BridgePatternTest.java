package com.design_patterns.demo.structural.bridge.example1;

public class BridgePatternTest {

    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape triG = new Triangle(new GreenColor());
        triG.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }

}
