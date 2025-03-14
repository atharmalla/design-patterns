package com.design_patterns.demo.creational.prototype.example2;


import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * ElfBeast.
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class BeastElf extends Beast {

    private final String helpType;

    public BeastElf(BeastElf elfBeast) {
        super(elfBeast);
        this.helpType = elfBeast.helpType;
    }

    @Override
    public String toString() {
        return "Elven eagle helps in " + helpType;
    }

}