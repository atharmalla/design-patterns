package com.design_patterns.demo.creational.prototype.example2;


/**
 * Interface for the factory class.
 */
public interface HeroFactory {

    Mage createMage();

    Warlord createWarlord();

    Beast createBeast();

}