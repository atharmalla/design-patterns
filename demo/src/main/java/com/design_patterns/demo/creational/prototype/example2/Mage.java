package com.design_patterns.demo.creational.prototype.example2;


import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Mage.
 */
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public abstract class Mage extends Prototype<Mage> {

    public Mage(Mage source) {
    }

}
