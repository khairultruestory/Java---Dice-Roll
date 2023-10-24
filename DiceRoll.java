import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) {
        // Create a Random object to simulate dice rolls
        Random random = new Random();

        // Generate a random number between 1 and 6 (inclusive)
        int diceRoll = random.nextInt(6) + 1;

        // Print the result
        System.out.println("You rolled a " + diceRoll);
    }
}
