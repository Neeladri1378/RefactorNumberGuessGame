
import java.util.Random;
import java.util.Scanner;

public class Game2 {

    int level;
    private Random random;
    private Scanner input;

    public Game2(int level) {
        this.level = level;
        this.random = new Random();
        this.input = new Scanner(System.in);
    }

    public void play() {
        int numbertoGuess = random.nextInt(100);
        int maxTries = level == 1 ? 10 : 5;

        for (int i = 0; i < maxTries; i++) {
            int guess = errorCheck(input);
            if (guess == numbertoGuess) {
                System.out.println("You won!");
                level++;
                return;
            } else if (guess < numbertoGuess) {
                System.out.println("The automated number you are searching for is higher");
            } else {
                System.out.println("The automated number you are searching for is lower");
            }
        }

        System.out.println("You lost! The number was " + numbertoGuess);
    }

    private static int errorCheck(Scanner sc) {
        System.out.println("Enter a number between 1 and 100:");
        if (sc.hasNextInt()) {
            int input = sc.nextInt();
            if (input > 100 || input < 1) {
                System.out.println("Invalid input. Try again.");
                return errorCheck(sc);
            } else {
                return input;
            }
        } else {
            System.out.println("Invalid input. Try again.");
            sc.next();
            return errorCheck(sc);
        }
    }
}

  
