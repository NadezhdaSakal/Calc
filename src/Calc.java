import java.util.Scanner;

public class Calc {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое значение");
        int a = scanner.nextInt();
        System.out.println("Введите второе значение");
        int b = scanner.nextInt();
        calculate(a, b);
    }

    public static void calculate(int a, int b) {
        System.out.println("Введите один из предложенных операторов: '+', '-', '*', '/'");
        String operator = scanner.next();

        int result;
        switch (operator) {
            case "+":
                result = sum(a, b);
                break;
            case "-" :
                result = substract(a, b);
                break;
            case "*" :
                result = multiply(a, b);
                break;
            case "/" :
                result = divide(a, b);
                break;
            default :
                System.out.println("Неизвестный оператор, попробуйте ввести снова");
                return;
        }

        System.out.println(a + " " + operator + " " + b + " = " + result);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int substract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
