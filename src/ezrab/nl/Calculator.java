package ezrab.nl;

import java.util.Scanner;

public class Calculator {

    private int number1;
    private int number2;
    private String operator;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int calculate() {
        switch (this.operator) {
            case "+":
                return this.number1 + this.number2;
            case "-":
                return this.number1 - this.number2;
            case "*":
                return this.number1 * this.number2;
            case "/":
                return this.number1 / this.number2;
            case "%":
                return this.number1 % this.number2;
        }
        return -1;
    }
}
