package com.design_patterns.demo.creational.prototype.example2;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * PrototypeTest
 *
 * @param <P> Prototype
 */
class PrototypeTest<P extends Prototype<P>> {
    static Collection<Object[]> dataProvider() {
        return List.of(
                new Object[]{new BeastOrc("axe"), "Orcish wolf attacks with axe"},
                new Object[]{new MageOrc("sword"), "Orcish mage attacks with sword"},
                new Object[]{new WarlordOrc("laser"), "Orcish warlord attacks with laser"},
                new Object[]{new BeastElf("cooking"), "Elven eagle helps in cooking"},
                new Object[]{new MageElf("cleaning"), "Elven mage helps in cleaning"},
                new Object[]{new WarlordElf("protecting"), "Elven warlord helps in protecting"}
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    void testPrototype(P testedPrototype, String expectedToString) {
        assertEquals(expectedToString, testedPrototype.toString());

        final var clone = testedPrototype.copy();
        assertNotNull(clone);
        assertNotSame(clone, testedPrototype);
        assertSame(testedPrototype.getClass(), clone.getClass());
        assertEquals(clone, testedPrototype);
    }

}