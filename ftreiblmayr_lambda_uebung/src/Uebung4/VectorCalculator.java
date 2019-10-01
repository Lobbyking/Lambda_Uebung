/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uebung4;

/**
 *
 * @author flori
 */
public class VectorCalculator extends AbstractCalculator {

    public VectorCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super(add, subtract, multiply, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        Number erg = null;

        erg = this.add.calc(a, b);

        System.out.println("x: " + erg.getA());
        System.out.println("y: " + erg.getB());

        return erg;
    }

    @Override
    public Number subtract(Number a, Number b) {
        Number erg = null;

        erg = this.subtract.calc(a, b);

        System.out.println("x: " + erg.getA());
        System.out.println("y: " + erg.getB());

        return erg;
    }

    @Override
    public Number multiply(Number a, Number b) {
        Number erg = null;

        erg = this.multiply.calc(a, b);

        System.out.println("x: " + erg.getA());
        System.out.println("y: " + erg.getB());

        return erg;
    }

    @Override
    public Number divide(Number a, Number b) {
        Number erg = null;

        erg = this.divide.calc(a, b);

        System.out.println("x: " + erg.getA());
        System.out.println("y: " + erg.getB());

        return erg;
    }

}
