import java.util.Scanner;

public class SingularArrayValues {
    public static void main(String[] args) {
        System.out.print("How many numbers will you enter: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        boolean isMatched;
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". Element: ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Singular Array Values: ");
        System.out.print("{" + array[0]);
        for (int i = 1; i < size; i++) {
            isMatched = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isMatched = true;
                    break;
                }
            }
            if (i == size - 1)
                System.out.print("}");
            if (!isMatched)
                System.out.print(", " + array[i]);
        }
    }
}
