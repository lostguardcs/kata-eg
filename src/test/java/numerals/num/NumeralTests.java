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
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.BeforeEach;

class NumeralTests {

    private Numeral n;
    @BeforeEach
    void setup(){
        n = new Numeral();
    }

    @ParameterizedTest
    @CsvSource({"I, 1", "V, 5", "X, 10", "L, 50", "C, 100", "D, 500", "M, 1000"})
    void testFundamentalNumerals(String result, int input){
        assertEquals(result, n.convert(input));
    }

    @Test
    void testTwoThousand(){
        assertEquals("MM", n.convert(2000));
    }

    @Test
    void testFour(){
        assertEquals("IV", n.convert(4));
    }

}
