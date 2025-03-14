package com.design_patterns.demo.creational.prototype.example2;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Beast.
 */
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public abstract class Beast extends Prototype<Beast> {

    public Beast(Beast source) {
    }

}
