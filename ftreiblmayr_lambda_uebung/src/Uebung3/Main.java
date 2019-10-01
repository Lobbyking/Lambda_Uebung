/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uebung3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author flori
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumberTester nt = new NumberTester("file.txt");

        nt.setOddEvenTester((number) -> {
            return number % 2 == 0;
        });

        nt.setPrimeTester((p) -> {
            List<Integer> prim = new ArrayList<>();

            for (int zaehler = 2; zaehler < Math.sqrt(p) + 1; zaehler++) {
                if (p == 2) {
                    return true;
                }
                if (p % zaehler == 0) {
                    return false;
                }
            }
            return true;

        });

        nt.setPalindromeTester((number) -> {
            String z = String.valueOf(number);
            String[] temp = z.split("");
            String comp = "";

            for(int i = temp.length; i > 0; --i){
                comp = comp + temp[i-1];
            }

            if (comp.equals(z)) {
                return true;
            }

            return false;
        });

        nt.testFile();
    }

}
