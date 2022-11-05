import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double operand1;
        char operation;
        double operand2;
        char calcOperator = 'c';
        double result = 0;


        do {
            if (calcOperator == 'c') {
                System.out.print("Введите число: ");
                operand1 = scanner.nextDouble();
                System.out.print("Введите оператор: ");
                operation = scanner.next().charAt(0);

            } else {
                operand1 = result;
                operation = calcOperator;
            }

            System.out.print("Введите число: ");
            operand2 = scanner.nextDouble();

            result = calculation(operand1, operand2, operation);
            System.out.println(operand1 + " " + operation + " " + operand2 + " = " + result);
            calcOperator = scanner.next().charAt(0);
        }
        while (calcOperator != 's');

    }

    private static double calculation(double operand1, double operand2, char operation) {
        return switch (operation) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            case '/' -> operand1 / operand2;
            default -> {
                System.out.println("Вы ввели недопустимую арифметическую операцию");
                yield 0;
            }
        };

    }
}






