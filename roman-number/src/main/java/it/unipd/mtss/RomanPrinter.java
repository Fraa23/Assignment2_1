////////////////////////////////////////////////////////////////////
// Sara Ristovic 2080101
// Francesco Lapenna 2072134
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import it.unipd.mtss.exception.OutOfRange;

public class RomanPrinter {
    public static String print(int num) {
        try {
            return printAsciiArt(IntegerToRoman.convert(num));
        }
        catch (OutOfRange e) {
            System.out.println("Input out of range.");
            return null;
        }
    }
    private static String printAsciiArt(String romanNumber) {
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
                " |______|  \n";
        String C = "   _____  \n" +
                "  / ____| \n" +
                " | |      \n" +
                " | |      \n" +
                " | |____  \n" +
                "  \\_____|  \n";
        String D = "  _____   \n" +
                " |  __ \\  \n" +
                " | |  | | \n" +
                " | |  | | \n" +
                " | |__| | \n" +
                " |_____/   \n";
        String M = "  __  __  \n" +
                " |  \\/  | \n" +
                " | \\  / | \n" +
                " | |\\/| | \n" +
                " | |  | | \n" +
                " |_|  |_|  \n";

        StringBuilder aux = new StringBuilder();
        for(int i = 0; i < romanNumber.length(); i++) {
            if (romanNumber.charAt(i) == 'I') {
                aux.append(I);
            }
            else if (romanNumber.charAt(i) == 'V') {
                aux.append(V);
            }
            else if (romanNumber.charAt(i) == 'X') {
                aux.append(X);
            }
            else if (romanNumber.charAt(i) == 'L') {
                aux.append(L);
            }
            else if (romanNumber.charAt(i) == 'C') {
                aux.append(C);
            }
            else if (romanNumber.charAt(i) == 'D') {
                aux.append(D);
            }
            else if (romanNumber.charAt(i) == 'M') {
                aux.append(M);
            }
        }

        System.out.println(aux.toString());
        return aux.toString();
    }
}
