package com.design_patterns.demo.creational.prototype.example2;



import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

/**
 * Prototype.
 */
@Slf4j
public abstract class Prototype<T> implements Cloneable {

    /**
     * Object a shallow copy of this object or null if this object is not Cloneable.
     */
    @SuppressWarnings("unchecked")
    @SneakyThrows
    public T copy() {
        return (T) super.clone();
    }
}