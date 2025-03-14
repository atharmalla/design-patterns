package com.design_patterns.demo.creational.prototype.example2;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Slf4j
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    /**
     * Program entry point.
     *
     * @param args command line args
     */
    public static void main(String[] args) {

        var factory = new HeroFactoryImpl(
                new MageElf("cooking"),
                new WarlordElf("cleaning"),
                new BeastElf("protecting")
        );
        var mage = factory.createMage();
        var warlord = factory.createWarlord();
        var beast = factory.createBeast();
        LOGGER.info(mage.toString());
        LOGGER.info(warlord.toString());
        LOGGER.info(beast.toString());

        factory = new HeroFactoryImpl(
                new MageOrc("axe"),
                new WarlordOrc("sword"),
                new BeastOrc("laser")
        );
        mage = factory.createMage();
        warlord = factory.createWarlord();
        beast = factory.createBeast();
        LOGGER.info(mage.toString());
        LOGGER.info(warlord.toString());
        LOGGER.info(beast.toString());
    }
}