package com.design_patterns.demo.creational.prototype.example2;


import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
/**
 * ElfWarlord.
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class WarlordElf extends Warlord {

    private final String helpType;

    public WarlordElf(WarlordElf elfWarlord) {
        super(elfWarlord);
        this.helpType = elfWarlord.helpType;
    }

    @Override
    public String toString() {
        return "Elven warlord helps in " + helpType;
    }
}