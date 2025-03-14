package com.design_patterns.demo.creational.prototype.example2;



import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * OrcMage.
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class MageOrc extends Mage {

    private final String weapon;

    public MageOrc(MageOrc orcMage) {
        super(orcMage);
        this.weapon = orcMage.weapon;
    }

    @Override
    public String toString() {
        return "Orcish mage attacks with " + weapon;
    }

}