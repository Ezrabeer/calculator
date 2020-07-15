package ezrab.nl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first number:");
        calculator.setNumber1(scanner.nextInt());

        System.out.println("Please enter your operator:");
        calculator.setOperator(scanner.next());

        System.out.println("Please enter your second number:");
        calculator.setNumber2(scanner.nextInt());

        System.out.println(calculator.calculate());
    }
}
