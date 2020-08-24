public class FizzBuzz {
    /**
     * Players generally sit in a circle. The player designated to go first says the number "1",
     * and the players then count upwards in turn. However, any number divisible by three is replaced by the word fizz and any number divisible by five by the word buzz.
     * Numbers divisible by 15 become fizz buzz. A player who hesitates or makes a mistake is eliminated from the game.
     * @author orhunyildiz
     */
    public static void main(String[] args) {
        count(35);
    }

    public static void count(int number) {
        String comma;
        for (int i = 1; i <= number; i++) {
            if (i == number)
                comma = "";
            else
                comma = ",";
            if (i % 15 == 0)
                System.out.print(" Fizz Buzz" + comma);
            else if (i % 3 == 0)
                System.out.print(" Fizz" + comma);
            else if (i % 5 == 0)
                System.out.print(" Buzz" + comma);
            else
                System.out.print(" " + i + comma);
        }
    }
}
