package com.design_patterns.demo.creational.prototype.example2;


import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * ElfMage.
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class MageElf extends Mage {

    private final String helpType;

    public MageElf(MageElf elfMage) {
        super(elfMage);
        this.helpType = elfMage.helpType;
    }

    @Override
    public String toString() {
        return "Elven mage helps in " + helpType;
    }

}