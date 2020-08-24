public class Reverse {
    public static void main(String[] args) {
        reverseString("pencil");
    }

    public static void reverseString(String string) {
        char[] arr = new char[string.length()];
        int j = 0;
        for (int i = 0; i < string.length(); i++) {
            j = string.length() - i - 1;
            if (j < 0)
                break;
            arr[i] = string.charAt(j);
            arr[j] = string.charAt(i);
        }

        for (int i = 0; i < string.length(); i++)
            System.out.print(arr[i]);
    }
}
