package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class romanCalcTest {
    @Test
    void shouldConvert1toI(){
        assertEquals("I", RomanCalc.convertToRoman(1));
    }

    // command n

}
