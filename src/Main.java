import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello");
        chooseGamemode();
    }
    static void chooseGamemode(){
        System.out.println("Choose gamemode!");
        System.out.println("Write 1 for an endless game or 2 for a game with three attempts:");
        Scanner input = new Scanner(System.in);
        int scn = input.nextInt();
        switch (scn){
            case 1:
                EndlessGame.game();
                break;
            case 2:
                AttemptsGame.game();;
                break;
            default:
                System.out.println("I did not get anything. Can you write again?");
                chooseGamemode();
        }
    }
}

