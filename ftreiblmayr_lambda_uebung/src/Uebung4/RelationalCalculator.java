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
public class RelationalCalculator extends AbstractCalculator {

    public RelationalCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super(add, subtract, multiply, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        Number x = new Number();
        x = this.add.calc(a, b);

        System.out.println(x.getA());
        System.out.println("----");
        System.out.println(x.getB());

        return x;
    }

    @Override
    public Number subtract(Number a, Number b) {
        Number x = new Number();
        x = this.subtract.calc(a, b);

        System.out.println(x.getA());
        System.out.println("----");
        System.out.println(x.getB());

        return x;
    }

    @Override
    public Number multiply(Number a, Number b) {
        Number x = new Number();
        x = this.multiply.calc(a, b);

        System.out.println(x.getA());
        System.out.println("----");
        System.out.println(x.getB());

        return x;
    }

    @Override
    public Number divide(Number a, Number b) {
        Number x = new Number();
        x =this.divide.calc(a, b);    
        
        System.out.println(x.getA());
        System.out.println("----");
        System.out.println(x.getB());
        
        return x;
    }

}
