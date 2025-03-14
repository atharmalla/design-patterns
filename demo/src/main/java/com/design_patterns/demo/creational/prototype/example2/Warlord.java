package com.design_patterns.demo.creational.prototype.example2;


import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Warlord.
 */
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public abstract class Warlord extends Prototype<Warlord> {

    public Warlord(Warlord source) {
    }

}