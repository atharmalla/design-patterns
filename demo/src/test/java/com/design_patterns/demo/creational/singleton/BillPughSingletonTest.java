package com.design_patterns.demo.creational.singleton;

public class BillPughSingletonTest extends SingletonTest<BillPughSingleton>{
    /**
     * Create a new singleton test instance using the given 'getInstance' method.
     */
    public BillPughSingletonTest() {
        super(BillPughSingleton::getInstance);
    }
}
