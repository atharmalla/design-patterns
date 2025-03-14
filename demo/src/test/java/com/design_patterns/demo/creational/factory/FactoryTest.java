package com.design_patterns.demo.creational.factory;


import com.design_patterns.demo.creational.factory.factory_method.example1.Computer;
import com.design_patterns.demo.creational.factory.factory_method.example1.ComputerFactory;

import static org.junit.jupiter.api.Assertions.assertSame;

public class FactoryTest {

    public static void main(String[] args) {
        Computer pc1 = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        Computer pc2 = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");

        Computer server1 = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        Computer server2 = ComputerFactory.getComputer("server","32 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc1);
        System.out.println("Factory Server Config::"+server1);

        assertSame(pc1, pc2);
        assertSame(server1, server2);
    }

}