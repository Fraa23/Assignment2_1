package it.unipd.mtss;

import static org.junit.Assert.*;
import org.junit.Test;


public class RomanPrinterTest {
    @Test
    public void testPrint_basicSymbols() {
        String I = "  _____  \n" +
                   " |_   _| \n" +
                   "   | |   \n" +
                   "   | |   \n" +
                   "  _| |_  \n" +
                   " |_____| \n";
        String V = " __      __ \n" +
                   " \\ \\    / / \n" +
                   "  \\ \\  / /  \n" +
                   "   \\ \\/ /   \n" +
                   "    \\  /    \n" +
                   "     \\/     \n";
        String X = " __   __ \n" +
                   " \\ \\ / / \n" +
                   "  \\ V /  \n" +
                   "   > <   \n" +
                   "  / . \\  \n" +
                   " /_/ \\_\\ \n";
        String L = "  _       \n" +
                   " | |      \n" +
                   " | |      \n" +
                   " | |      \n" +
                   " | |____  \n" +
                   " |______| \n";
        String C = "   _____  \n" +
                   "  / ____| \n" +
                   " | |      \n" +
                   " | |      \n" +
                   " | |____  \n" +
                   "  \\_____| \n";
        String D = "  _____   \n" +
                   " |  __ \\  \n" +
                   " | |  | | \n" +
                   " | |  | | \n" +
                   " | |__| | \n" +
                   " |_____/  \n";
        String M = "  __  __  \n" +
                   " |  \\/  | \n" +
                   " | \\  / | \n" +
                   " | |\\/| | \n" +
                   " | |  | | \n" +
                   " |_|  |_| \n";

        assertEquals(I, RomanPrinter.print(1));
        assertEquals(V, RomanPrinter.print(5));
        assertEquals(X, RomanPrinter.print(10));
        assertEquals(L, RomanPrinter.print(50));
        assertEquals(C, RomanPrinter.print(100));
        assertEquals(D, RomanPrinter.print(500));
        assertEquals(M, RomanPrinter.print(1000));
    }

    @Test
    public void testPrint_multipleLetters() {
        String multipleDigits =
                "   _____    __  __  \n" +
                        "  / ____|  |  \\/  | \n" +
                        " | |       | \\  / | \n" +
                        " | |       | |\\/| | \n" +
                        " | |____   | |  | | \n" +
                        "  \\_____|  |_|  |_| \n";

        assertEquals(multipleDigits, RomanPrinter.print(900));
    }
}
