/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uebung2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author flori
 */
public class HalloJavamitForEach {

    List<String> list = new ArrayList<>();

    public void halloJavaMitForEach() {
        list.add("Hallo ");
        list.add("Java");

        for (String s : list) {
            System.out.print(s);
        }

        System.out.println("");

        list.forEach((String s) -> System.out.print(s));

        System.out.println("");

        list.forEach(System.out::print);

        System.out.println("");
    }
}
