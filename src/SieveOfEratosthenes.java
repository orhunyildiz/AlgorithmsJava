import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen pozitif bir tamsayı girin: ");
        int n = scanner.nextInt();

        countNumberOfPrimesUpTo(n);

    }

    public static void countNumberOfPrimesUpTo(int n) {
        boolean[] list = new boolean[n + 1];
        Arrays.fill(list, true);
        int upperBound = (int) (Math.sqrt(n) + 1);

        for (int i = 2; i <= upperBound; i++) {
            if (list[i])
                for (int j = 2; i * j <= n; j++)
                    list[i * j] = false;
        }

        int numberOfPrimes = 0;

        for (boolean b : list) {
            if (b)
                numberOfPrimes++;
        }
        System.out.println(n + " sayısına kadar " + (numberOfPrimes - 2) + " tane asal sayı vardır.");
    }
}
