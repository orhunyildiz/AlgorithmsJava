public class PrimeNumber {
    public static void main(String[] args) {
        int count = countPrimes(1000000);
        System.out.println("\nCount: " + count);
    }

    public static boolean isPrime(int number) {
        int upperBound = (int) (Math.sqrt(number) + 1);
        for (int i = 2; i < upperBound; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static int countPrimes(int number) {
        int count = 0;
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
        return count;
    }
}
