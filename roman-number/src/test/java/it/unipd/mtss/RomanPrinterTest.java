package it.unipd.mtss;

import static org.junit.Assert.*;
import org.junit.Test;


public class RomanPrinterTest {
    @Test
    public void testPrint_basicSymbols() {
       assertEquals(RomanPrinter.print(1),
               "  _____  \n" +
               " |_   _| \n" +
               "   | |   \n" +
               "   | |   \n" +
               "  _| |_  \n" +
               " |_____| \n" );

       assertEquals(RomanPrinter.print(5),
               " __      __ \n" +
                       " \\ \\    / / \n" +
                       "  \\ \\  / /  \n" +
                       "   \\ \\/ /   \n" +
                       "    \\  /    \n" +
                       "     \\/     \n");

       assertEquals(RomanPrinter.print(10),
               " __   __ \n" +
                       " \\ \\ / / \n" +
                       "  \\ V /  \n" +
                       "   > <   \n" +
                       "  / . \\  \n" +
                       " /_/ \\_\\ \n");

       assertEquals(RomanPrinter.print(50),
                 "  _       \n" +
                        " | |      \n" +
                        " | |      \n" +
                        " | |      \n" +
                        " | |____  \n" +
                        " |______|  \n");

       assertEquals(RomanPrinter.print(100),
                "   _____  \n" +
                        "  / ____| \n" +
                        " | |      \n" +
                        " | |      \n" +
                        " | |____  \n" +
                        "  \\_____|  \n" );

       assertEquals(RomanPrinter.print(500),
                "  _____   \n" +
                        " |  __ \\  \n" +
                        " | |  | | \n" +
                        " | |  | | \n" +
                        " | |__| | \n" +
                        " |_____/   \n" );

       assertEquals(RomanPrinter.print(1000),
               "  __  __  \n" +
                       " |  \\/  | \n" +
                       " | \\  / | \n" +
                       " | |\\/| | \n" +
                       " | |  | | \n" +
                       " |_|  |_|  \n" );
    }
}
