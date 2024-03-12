public class DivisionExample {

    public static void divideNumbers(int numerator, int denominator) {
        try {
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        }
    }

    public static void Exceptions2(String[] args) {
        int numerator = 10;
        int denominator = 0;

        divideNumbers(numerator, denominator);
    }
}