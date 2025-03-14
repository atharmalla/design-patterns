package com.design_patterns.demo.creational.prototype.example2;


import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * OrcBeast.
 */
@EqualsAndHashCode(callSuper = false)
@RequiredArgsConstructor
public class BeastOrc extends Beast {

    private final String weapon;

    public BeastOrc(BeastOrc orcBeast) {
        super(orcBeast);
        this.weapon = orcBeast.weapon;
    }

    @Override
    public String toString() {
        return "Orcish wolf attacks with " + weapon;
    }

}