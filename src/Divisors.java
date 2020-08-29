public class Divisors {
    public static void main(String[] args) {
        int number = 448;
        System.out.print(number + "'s divisors: ");
        divisors(number);
        System.out.print("\n" + number + " = ");
        primeDivisors(number);
    }

    public static void divisors(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                System.out.print(i + " ");
        }
    }

    public static void primeDivisors(int number) {
        int count;
        int exNumber;
        for (int i = 2; i < number; i++) {
            count = 0;
            exNumber = number;
            while (number % i == 0) {
                count++;
                number /= i;
            }
            if (number * 2 == exNumber) {
                System.out.print(i + "*");
                continue;
            }
            if ((number == 1 || count == 1 || PrimeNumber.isPrime(number)) && i != 2)
                System.out.print("*");
            if (count == 1)
                System.out.print(i);
            if (exNumber % i == 0 && count != 1) {
                System.out.print(i + "^" + count);
            }
            if (PrimeNumber.isPrime(number) && number != 1 && count == 0) {
                System.out.print(number);
                break;
            }
        }
    }
}
