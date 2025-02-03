package com.design_patterns.demo.creational.singleton;

public class LazyInitializedSingletonTest extends SingletonTest<LazyInitializedSingleton>{
    /**
     * Create a new singleton test instance using the given 'getInstance' method.
     */
    public LazyInitializedSingletonTest() {
        super(LazyInitializedSingleton::getInstance);
    }
}
