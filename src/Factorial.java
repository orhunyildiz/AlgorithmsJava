public class Factorial {
    public static void main(String[] args) {
        calculateFactorial(6);
        long l = calculateFactorialWithRecursion(6);
        long number = 6;
        System.out.println(number + "! = " + l);

    }

    public static void calculateFactorial(long l) {
        long multi = 1L;
        long number = l;
        for (; l > 0; l--)
            multi *= l;
        System.out.println(number + "! = " + multi);
    }

    public static long calculateFactorialWithRecursion(long l) {
        if (l >= 1)
            return l * calculateFactorialWithRecursion(l - 1);
        else
            return 1;
    }
}
