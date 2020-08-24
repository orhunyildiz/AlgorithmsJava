public class BreakWithLabel {
    public static void main(String[] args) {
        int[][] arr = {{32, 87, 3, 589}, {12, 1076, 2000, 12}, {622, 127, 12, 12}};

        int searchFor = 12;
        boolean foundIt = false;

        here: for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == searchFor) {
                    foundIt = true;
                    System.out.println("Found " + searchFor + " at " + i + ", " + j);
                    break here;
                }
            }
        }

        if (!foundIt)
            System.out.println(searchFor + " not in this array.");
    }
}
