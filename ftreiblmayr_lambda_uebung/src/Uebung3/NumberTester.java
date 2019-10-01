/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uebung3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author flori
 */
public class NumberTester {

    String file;

    private NumberTest oddTester = null;
    private NumberTest primeTester = null;
    private NumberTest palindromeTester = null;

    public NumberTester(String fileName) {
        file = fileName;
    }    
    
    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(file));) {
            int runs = Integer.valueOf(br.readLine());

            for (int i = 0; i < runs; ++i) {
                String read = br.readLine();
                String[] temp = read.split(" ");
                int[] arr = new int[2];
                arr[0] = Integer.valueOf(temp[0]);
                arr[1] = Integer.valueOf(temp[1]);

                if (arr[0] == 1) {
                    if(oddTester.testNumber(arr[1])){
                        System.out.println("EVEN");
                    }else{
                        System.out.println("ODD");
                    }
                }else if(arr[0] == 2){
                    if(primeTester.testNumber(arr[1])){
                        System.out.println("PRIME");
                    }else{
                        System.out.println("NO PRIME");
                    }
                }else if(arr[0] == 3){
                    if(palindromeTester.testNumber(arr[1])){
                        System.out.println("PALINDROME");
                    }else{
                        System.out.println("NO PALINDROME");
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fehler! Datei nicht gefunden!");
        } catch (IOException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
