import java.util.Scanner;

public class MultiplyingMatrix {
    public static void main(String[] args) {
        int row1, col1, row2, col2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. matrisin satır sayısı: ");
        row1 = scanner.nextInt();
        System.out.print("1. matrisin sütun sayısı: ");
        col1 = scanner.nextInt();
        System.out.print("2. matrisin satır sayısı: ");
        row2 = scanner.nextInt();
        System.out.print("2. matrisin sütun sayısı: ");
        col2 = scanner.nextInt();

        if (col1 == row2) {
            int[][] matrix1 = new int[row1][col1];
            int[][] matrix2 = new int[row2][col2];
            int[][] result = new int[row1][col2];
            System.out.println("1. matrisin: ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    System.out.print("[" + i + "]" + "[" + j + "] elemanı: ");
                    matrix1[i][j] = scanner.nextInt();
                }
            }
            System.out.println("2. matrisin: ");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print("[" + i + "]" + "[" + j + "] elemanı: ");
                    matrix2[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < col1; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            System.out.println("Sonuç: ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print("\t" + result[i][j]);
                }
                System.out.println();
            }
        }
        else
            System.out.println("Hata! Bu iki matris çarpılamaz.");
    }
}
