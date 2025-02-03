package com.design_patterns.demo.creational.singleton;

import java.util.function.Supplier;

public class EagerInitializedSingletonTest extends SingletonTest<EagerInitializedSingleton>{
    /**
     * Create a new singleton test instance using the given 'getInstance' method.
     */
    public EagerInitializedSingletonTest() {
        super(EagerInitializedSingleton::getInstance);
    }
}
