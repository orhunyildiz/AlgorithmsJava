public class Yildizlamak {
    public static void main(String[] args) {
        stars("congratulations");
    }

    public static void stars(String string) {
        int length = string.length() + (string.length() - 1);
        char[] arr = new char[length];
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0)
                arr[i] = string.charAt(i / 2);
            else
                arr[i] = '*';
        }

        for (int i = 0; i < length; i++)
            System.out.print(arr[i]);
    }
}
