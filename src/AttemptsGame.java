import java.util.Random;
import java.util.Scanner;

public class AttemptsGame {
    static int randomNumber;
    static int attempt;


    static void game() {
        Random rand = new Random();
        randomNumber = rand.nextInt(10);
        System.out.println("Try to guess a number from 0 to 10 in three tries");
        input_results();
    }
    private static void input_results() {
        Scanner input = new Scanner(System.in);
        int userInput;
        do {
            attempt++;
            System.out.print("Write your number: ");
            userInput = input.nextInt();
            if (attempt > 2) {
                System.out.println("You loose:-(");
                break;
            }else if (userInput > randomNumber){
                System.out.println("Number is less");
            } else if (userInput < randomNumber) {
                System.out.println("Number is higher");
            } else {
                System.out.println("You guessed right and you are a molodechik-ogurechik!");
            }
        } while (userInput != randomNumber);
        restartGame();
    }
    private static void restartGame(){
        System.out.println("Try again yes or no?");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        switch (word) {
            case "yes":
                game();
                break;
            case "YES":
                What.game();
                break;
            case "no":
                Main.chooseGamemode();
                break;
            default:
                System.out.println("Bro I don't understand what you wrote. Try again. Pls.");
                restartGame();
        }
    }
}
