import java.util.Scanner;

public class Hangman{
    public static void main(String[] args){
      
    IO.println("test");
       // char guess = '';

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter guess word: ");
        String word = Input.nextLine();
        boolean wordGuessed = false;
        int correctGuessesCount = 0;

        int lives = 6;
        while((lives != 0) || (wordGuessed = false)) {
            System.out.println("Word length is: " + word.length());
            System.out.println("Enter your guess: ");
            char guess = Input.next().charAt(0);
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    System.out.println("Guess correct!");
                    correctGuessesCount = word.length()-1;
                    if(correctGuessesCount == 0){
                        System.out.println("YOU GUESSED THE WORD!");
                        wordGuessed = true;
                    }
                    break;
                } else {
                    System.out.println("Guess wrong!");
                    lives--;
                    System.out.println("Lives left:" + lives);
                    break;
                }
            }
        }

    }
}