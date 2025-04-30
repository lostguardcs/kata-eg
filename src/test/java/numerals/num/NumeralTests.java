/*
 * Copyright 2015-2025 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package numerals.num;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.BeforeEach;

class NumeralTests {

    private Numeral n;
    @BeforeEach
    void setup(){
        n = new Numeral();
    }

    @Test
    void testOne(){
        assertEquals("I", n.convert(1));
    }

    @Test
    void testFive(){
        assertEquals("V", n.convert(5));
    }

    @Test
    void testTen(){
        assertEquals("X", n.convert(10));
    }

    @Test
    void testFifty(){
        assertEquals("L", n.convert(50));
    }

    @Test 
    void testOneHundred(){
        assertEquals("C", n.convert(100));
    }
}
