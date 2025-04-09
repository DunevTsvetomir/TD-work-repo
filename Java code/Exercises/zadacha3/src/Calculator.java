import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char operator;
        double number1, number2, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Choose an operator: +, -, *, /, m (modulus) or %");
        operator = input.next().charAt(0);

        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();

        switch (operator) {

            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            case 'm':
                result = number1 % number2;
                System.out.println(number1 + " % " + number2 + " = " + result);
                break;

            case '%':
                result = (number2 / number1) * 100;
                System.out.println(number2 + " is " + result + " percent of " + number1);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}