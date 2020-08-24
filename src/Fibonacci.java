public class Fibonacci {
    public static void main(String[] args) {
        printFibonacci(30);
        int number = printFibonacciSumWithRecursion(10);
        System.out.println(number);
    }
    public static void printFibonacci(int number) {
        int fibonacciNumber1 = 1;
        int fibonacciNumber2 = 1;
        int sum;
        System.out.format("%8d", fibonacciNumber1);
        System.out.format("%8d", fibonacciNumber2);

        for (int i = 3; i <= number; i++) {
            sum = fibonacciNumber1 + fibonacciNumber2;
            fibonacciNumber2 = fibonacciNumber1;
            fibonacciNumber1 = sum;
            if (i % 10 == 0)
                System.out.println();
            else
                System.out.format("%8d", sum);
        }
    }

    public static int printFibonacciSumWithRecursion(int number) {
        if (number == 1 || number == 2)
            return 1;
        return printFibonacciSumWithRecursion(number - 1) + printFibonacciSumWithRecursion(number - 2);
    }
}
