package com.design_patterns.demo.creational.prototype.example2;


import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * OrcWarlord.
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class WarlordOrc extends Warlord {

    private final String weapon;

    public WarlordOrc(WarlordOrc orcWarlord) {
        super(orcWarlord);
        this.weapon = orcWarlord.weapon;
    }

    @Override
    public String toString() {
        return "Orcish warlord attacks with " + weapon;
    }

}