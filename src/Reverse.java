public class Reverse {
    public static void main(String[] args) {
        reverseString("pencil");
    }

    public static void reverseString(String string) {
        char[] arr = new char[string.length()];
        
        int j = string.length() - 1;
        for (int i = 0; i < string.length(); i++) {
            arr[j] = string.charAt(i);
            j--;
        }

        for (int i = 0; i < string.length(); i++)
            System.out.print(arr[i]);
    }
}
