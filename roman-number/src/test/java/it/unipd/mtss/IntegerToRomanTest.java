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
        IntegerToRoman converter = new IntegerToRoman();
        converter.convert(0);
    }

    @Test(expected = OutOfRange.class)
    public void testConvert_outOfRange_tooHigh() throws OutOfRange {
        IntegerToRoman converter = new IntegerToRoman();
        converter.convert(1001);
    }

    @Test(expected = OutOfRange.class)
    public void testConvert_outOfRange_negative() throws OutOfRange {
        IntegerToRoman converter = new IntegerToRoman();
        converter.convert(-1);
    }

    @Test
    public void testConvert_singleDigit() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("I", converter.convert(1));
        assertEquals("IV", converter.convert(4));
        assertEquals("V", converter.convert(5));
        assertEquals("IX", converter.convert(9));
    }

    @Test 
    public void testConvert_doubleDigit() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("X", converter.convert(10));
        assertEquals("XL", converter.convert(40));
        assertEquals("L", converter.convert(50));
        assertEquals("XC", converter.convert(90));
    }

    @Test
    public void testConvert_tripleDigit() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("C", converter.convert(100));
        assertEquals("CD", converter.convert(400));
        assertEquals("D", converter.convert(500));
        assertEquals("CM", converter.convert(900));
        assertEquals("M", converter.convert(1000));
    }

}
