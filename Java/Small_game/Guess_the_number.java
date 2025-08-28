package Small_game;
import java.util.Scanner;
import java.util.Random;
public class Guess_the_number {
    public static void main(String[] args) {
        Random random = new Random();
        int numbertoguess = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int guess;
        int attempts = 0;
        while (true) {
            guess = scanner.nextInt();
            attempts++;
            if (guess < numbertoguess) {
                System.out.println("kaffi kam hai");
            } else if (guess > numbertoguess) {
                System.out.println("kaffi jyda hai");
            } else {
                System.out.println("ayye you got it in " + attempts + " attempts");
                break;
            }
        }

        scanner.close();
    }
}
