////////////////////////////////////////////////////////////////////
// Sara Ristovic 2080101
// Francesco Lapenna 2072134
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import it.unipd.mtss.exception.OutOfRange;

import java.util.Arrays;

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
        String [][] I = { {"  _____  "},
                          {" |_   _| "},
                          {"   | |   "},
                          {"   | |   "},
                          {"  _| |_  "},
                          {" |_____| "} };

        String [][] V = { {" __      __ "},
                          {" \\ \\    / / "},
                          {"  \\ \\  / /  "},
                          {"   \\ \\/ /   "},
                          {"    \\  /    "},
                          {"     \\/     "} };

        String [][] X = { {" __   __ "},
                          {" \\ \\ / / "},
                          {"  \\ V /  "},
                          {"   > <   "},
                          {"  / . \\  "},
                          {" /_/ \\_\\ "} };

        String [][] L = { {"  _       "},
                          {" | |      "},
                          {" | |      "},
                          {" | |      "},
                          {" | |____  "},
                          {" |______| "} };

        String [][] C = { {"   _____  "},
                          {"  / ____| "},
                          {" | |      "},
                          {" | |      "},
                          {" | |____  "},
                          {"  \\_____| "} };

        String [][] D = { {"  _____   "},
                          {" |  __ \\  "},
                          {" | |  | | "},
                          {" | |  | | "},
                          {" | |__| | "},
                          {" |_____/  "} };

        String [][] M = { {"  __  __  "},
                          {" |  \\/  | "},
                          {" | \\  / | "},
                          {" | |\\/| | "},
                          {" | |  | | "},
                          {" |_|  |_| "} };

        String [][] aux_mat = { {""},
                                {""},
                                {""},
                                {""},
                                {""},
                                {""} };

        for(int i = 0; i < romanNumber.length(); i++) {
            if (romanNumber.charAt(i) == 'I') {
                concatMatrix(aux_mat, I);
            }
            else if (romanNumber.charAt(i) == 'V') {
                concatMatrix(aux_mat, V);
            }
            else if (romanNumber.charAt(i) == 'X') {
                concatMatrix(aux_mat, X);
            }
            else if (romanNumber.charAt(i) == 'L') {
                concatMatrix(aux_mat, L);
            }
            else if (romanNumber.charAt(i) == 'C') {
                concatMatrix(aux_mat, C);
            }
            else if (romanNumber.charAt(i) == 'D') {
                concatMatrix(aux_mat, D);
            }
            else if (romanNumber.charAt(i) == 'M') {
                concatMatrix(aux_mat, M);
            }
        }

        // String aux_str = Arrays.deepToString(aux_mat);

        String aux_str = "";
        for(int i = 0; i < 6; i++) {
            aux_str += (aux_mat[i][0] + System.lineSeparator());
        }

        System.out.println(aux_str);
        return aux_str;
    }

    private static void concatMatrix(String m1[][], String m2[][]) {
        for(int i = 0; i < 6; i++) {
            m1[i][0] += m2[i][0];
        }
    }

    private static void printMatrix(String m[][]) {
        for(String[] row : m) {
            System.out.println(Arrays.toString(row));
        }
    }
}
