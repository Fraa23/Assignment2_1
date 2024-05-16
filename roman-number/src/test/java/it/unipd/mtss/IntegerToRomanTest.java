////////////////////////////////////////////////////////////////////
// Sara Ristovic 2080101
// Francesco Lapenna 2072134
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.*;
import it.unipd.mtss.exception.OutOfRange;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test(expected = OutOfRange.class)
    public void testConvert_outOfRange_tooLow() throws OutOfRange {
        IntegerToRoman.convert(0);
    }

    @Test(expected = OutOfRange.class)
    public void testConvert_outOfRange_tooHigh() throws OutOfRange {
        IntegerToRoman.convert(1001);
    }

    @Test(expected = OutOfRange.class)
    public void testConvert_outOfRange_negative() throws OutOfRange {
        IntegerToRoman.convert(-1);
    }

    @Test
    public void testConvert_singleDigit() {
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    public void testConvert_doubleDigit() {
        assertEquals("X", IntegerToRoman.convert(10));
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("L", IntegerToRoman.convert(50));
        assertEquals("XC", IntegerToRoman.convert(90));
    }

    @Test
    public void testConvert_tripleDigit() {
        assertEquals("C", IntegerToRoman.convert(100));
        assertEquals("CD", IntegerToRoman.convert(400));
        assertEquals("D", IntegerToRoman.convert(500));
        assertEquals("CM", IntegerToRoman.convert(900));
        assertEquals("M", IntegerToRoman.convert(1000));
    }

}
