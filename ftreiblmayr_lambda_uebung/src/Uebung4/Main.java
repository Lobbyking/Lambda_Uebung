/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uebung4;

import java.util.Scanner;

/**
 *
 * @author flori
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Number n1 = new Number();
    static Number n2 = new Number();
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        AbstractCalculator c = null;

        int eingabe = 0;
        boolean flag = true;

        while (eingabe != 4) {
            System.out.println("Choose calculator:");
            System.out.println("1..Relational calculator");
            System.out.println("2..Vector calculator");
            System.out.println("3..Complex calculator");
            System.out.println("4..Exit");

            eingabe = s.nextInt();

            switch (eingabe) {
                case 1:
                    askForNumbers(1);
                    c = new RelationalCalculator(
                            (num1, num2) -> {
                                Number erg = new Number();
                                if (num1.getB() == num2.getB()) {
                                    erg.setA(num1.getA() + num2.getA());
                                    erg.setB(num1.getB());
                                } else {
                                    num1.setA(num1.getA() * num2.getB());
                                    num2.setA(num2.getA() * num1.getB());
                                    double newB = num1.getB() * num2.getB();
                                    num1.setB(newB);
                                    num2.setB(newB);
                                    erg.setA(num1.getA() + num2.getA());
                                    erg.setB(num1.getB());
                                }

                                return erg;
                            },
                            (num1, num2) -> {
                                Number erg = new Number();
                                if (num1.getB() == num2.getB()) {
                                    erg.setA(num1.getA() - num2.getA());
                                    erg.setB(num1.getB());
                                } else {
                                    num1.setA(num1.getA() * num2.getB());
                                    num2.setA(num2.getA() * num1.getB());
                                    double newB = num1.getB() * num2.getB();
                                    num1.setB(newB);
                                    num2.setB(newB);
                                    erg.setA(num1.getA() - num2.getA());
                                    erg.setB(num1.getB());
                                }

                                return erg;
                            },
                            (num1, num2) -> {
                                Number erg = new Number();

                                erg.setA(num1.getA() * num2.getA());
                                erg.setB(num1.getB() * num2.getB());

                                return erg;
                            },
                            (num1, num2) -> {
                                Number erg = new Number();

                                erg.setA(num1.getA() * num2.getB());
                                erg.setB(num1.getB() * num2.getA());

                                return erg;
                            }
                    );

                    askForCalc();

                    eingabe = s.nextInt();
                    flag = true;
                    while (flag) {
                        switch (eingabe) {
                            case 1:
                                c.add(n1, n2);
                                flag = false;
                                break;
                            case 2:
                                c.subtract(n1, n2);
                                flag = false;
                                break;
                            case 3:
                                c.multiply(n1, n2);
                                flag = false;
                                break;
                            case 4:
                                c.divide(n1, n2);
                                flag = false;
                                break;
                            case 5:
                                askForNumbers(1);
                                askForCalc();
                                eingabe = s.nextInt();
                                break;
                        }
                    }
                    break;
                case 2:
                    askForNumbers(2);

                    c = new VectorCalculator(
                            (num1, num2) -> {
                                Number erg = new Number();
                                erg.setA(num1.getA() + num2.getA());
                                erg.setB(num1.getB() + num2.getB());
                                return erg;
                            },
                            (num1, num2) -> {
                                Number erg = new Number();
                                erg.setA(num1.getA() - num2.getA());
                                erg.setB(num1.getB() - num2.getB());
                                return erg;
                            },
                            (num1, num2) -> {
                                Number erg = new Number();
                                erg.setA(num1.getA() * num2.getB());
                                erg.setB(num1.getB() * num2.getA());
                                return erg;
                            },
                            (num1, num2) -> {
                                Number erg = new Number();
                                erg.setA(num1.getA() * num2.getA());
                                erg.setB(num1.getB() * num2.getB());
                                return erg;
                            }
                    );

                    askForCalc();

                    eingabe = s.nextInt();
                    flag = true;
                    while (flag) {
                        switch (eingabe) {
                            case 1:
                                c.add(n1, n2);
                                flag = false;
                                break;
                            case 2:
                                c.subtract(n1, n2);
                                flag = false;
                                break;
                            case 3:
                                c.multiply(n1, n2);
                                flag = false;
                                break;
                            case 4:
                                c.divide(n1, n2);
                                flag = false;
                                break;
                            case 5:
                                askForNumbers(1);
                                askForCalc();
                                eingabe = s.nextInt();

                                break;
                        }
                    }
                    break;
                case 3:
                    askForNumbers(3);
                    c = new ComplexCalculator(
                            (num1, num2) -> {
                                Number erg = new Number();

                                erg.setA(num1.getA() + num2.getA());
                                erg.setB(num1.getB() + num2.getB());

                                return erg;
                            },
                            (num1, num2) -> {
                                Number erg = new Number();

                                erg.setA(num1.getA() - num2.getA());
                                erg.setB(num2.getA() - num2.getB());

                                return erg;
                            },
                            (num1, num2) -> {
                                Number erg = new Number();

                                double temp = num1.getB() * num2.getB();
                                temp = temp * -1;
                                erg.setA(num1.getA() * num2.getA() + temp);
                                erg.setB(num1.getA() * num2.getB() + num2.getA() * num1.getB());

                                return erg;
                            },
                            (num1, num2) -> {
                                Number erg = new Number();

                                double a = num1.getA();
                                double b = num1.getB();
                                double x = num2.getA();
                                double d = num2.getB();

                                erg.setA((a * x + b * d) / Math.pow(x, 2) + Math.pow(d, 2));
                                erg.setB((b * x - a * d) / Math.pow(x, 2) + Math.pow(d, 2));

                                return erg;
                            }
                    );

                    askForCalc();

                    eingabe = s.nextInt();

                    flag = true;
                    while (flag) {
                        switch (eingabe) {
                            case 1:
                                c.add(n1, n2);
                                flag = false;
                                break;
                            case 2:
                                c.subtract(n1, n2);
                                flag = false;
                                break;
                            case 3:
                                c.multiply(n1, n2);
                                flag = false;
                                break;
                            case 4:
                                c.divide(n1, n2);
                                flag = false;
                                break;
                            case 5:
                                askForNumbers(1);
                                askForCalc();
                                eingabe = s.nextInt();

                                break;
                        }
                    }
                    break;
                case 4:
                    System.exit(eingabe);
                    break;
                default:
                    System.out.println("Bitte geben Sie eine gültige Zahl ein!");
                    eingabe = s.nextInt();
                    break;
            }

        }
    }

    public static void askForNumbers(int x) {
        if (x == 1) {
            System.out.println("Ersten Zähler eingeben.");
            n1.setA(s.nextDouble());
            System.out.println("Ersten Nenner eingeben.");
            n1.setB(s.nextDouble());
            System.out.println("Zweiten Zähler eingeben.");
            n2.setA(s.nextDouble());
            System.out.println("Zweiten Nenner eingeben.");
            n2.setB(s.nextDouble());
        } else if (x == 2) {
            System.out.println("Ersten X-Wert eingeben.");
            n1.setA(s.nextDouble());
            System.out.println("Ersten Y-Wert eingeben.");
            n1.setB(s.nextDouble());
            System.out.println("Zweiten X-Wert eingeben.");
            n2.setA(s.nextDouble());
            System.out.println("Zweiten Y-Wert eingeben.");
            n2.setB(s.nextDouble());
        } else {
            System.out.println("Ersten Realen-Wert eingeben.");
            n1.setA(s.nextDouble());
            System.out.println("Ersten Imaginieren-Wert eingeben.");
            n1.setB(s.nextDouble());
            System.out.println("Zweiten Realen-Wert eingeben.");
            n2.setA(s.nextDouble());
            System.out.println("Zweiten Imaginieren-Wert eingeben.");
            n2.setB(s.nextDouble());
        }
    }

    public static void askForCalc() {
        System.out.println("Choose operation");
        System.out.println("1..add");
        System.out.println("2..subract");
        System.out.println("3..mulitplay");
        System.out.println("4..divide");
        System.out.println("5..Enter numbers again");
    }
}
