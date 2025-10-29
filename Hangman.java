import java.util.Scanner;

public class Hangman{
    public static void main(String[] args){
       // char guess = '';

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter guess word: ");
        String word = Input.nextLine();

        int lives = 6;

        for (int i = 0; i < word.length(); i++){
            System.out.println("Word length is: " + word.length());
            System.out.println("Enter your guess: ");
            char guess = Input.next().charAt(0);
            if (lives == 0) {
                System.out.println("Game Over!");
                break;
            }
            if (word.charAt(i) == guess){
                System.out.println("Guess correct!");
            } else {
                System.out.println("Guess wrong!");
                lives--;
                System.out.println("Lives left:" + lives);
            }
        }

    }
}