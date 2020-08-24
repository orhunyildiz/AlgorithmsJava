import java.util.Scanner;

public class TheRootsOfASecondOrderPolynomial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b and c values of a equation of ax^2+bx+c");
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();
        System.out.println("Equation: " + a + "x^2+" + b + "x+" + c);

        double delta = b * b - 4 * a * c;

        double x1 = (-b - Math.sqrt(delta)) / 2 * a;
        double x2 = (-b + Math.sqrt(delta)) / 2 * a;

        if (delta < 0)
            System.out.println("The roots of the equation are none due to delta is less than zero");
        else  if (delta == 0)
            System.out.println("The equation has a root due to delta equals to zero.\nThe root: " + x1);
        else
            System.out.println("The roots\nFirst one: " + x1 + "\nSecond one: " + x2);

    }
}
