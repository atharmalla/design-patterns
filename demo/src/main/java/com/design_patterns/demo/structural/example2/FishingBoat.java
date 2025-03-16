package com.design_patterns.demo.structural.example2;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Device class (adaptee in the pattern). We want to reuse this class. Fishing boat moves by
 * sailing.
 */
@Slf4j
final class FishingBoat {
    private static final Logger LOGGER = LoggerFactory.getLogger(FishingBoat.class);

    void sail() {
        LOGGER.info("The fishing boat is sailing");
    }

}