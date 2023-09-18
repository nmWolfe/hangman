import java.util.ArrayList;
import java.util.Scanner;

public class HangMan {

    private final String word;
    private final Scanner scanner;
    private final ConvertWord converter;
    private final int maxAttempts = 7;
    private int attempts = 0;

    public HangMan() {
        this.scanner = new Scanner(System.in);
        this.word = Words.generateRandomWord();
        this.converter = new ConvertWord();
    }

    public void startGame() {

        String[] gameStart = {
                "1 - Play a game of HangMan",
                "2 - Quit"
        };


        System.out.println("\n");
        System.out.println("*************** Welcome to Hangman ***************");

        while (true) {
            for (String option : gameStart) {
                System.out.println(option);
            }
            String playerChoice = scanner.nextLine();
            if (playerChoice.equals("1")) {

                ArrayList<String> hiddenWordArr = converter.convertToUnderscore(word);
                ArrayList<String> wordArray = converter.convertWordToArray(word);

                System.out.println("Ok, let's play. ");
                System.out.println(String.join("", hiddenWordArr));

                while (attempts < maxAttempts && !hiddenWordArr.equals(wordArray)) {

                    System.out.println("Enter your guess: ");

                    String playerGuess = scanner.nextLine().toUpperCase();

                    if (playerGuess.length() != 1) {
                        System.out.println("Please enter a single character as your guess.");
                        continue;
                    }

                    ArrayList<Integer> playerIndex;

                    playerIndex = ValidateGuess.checkGuess(wordArray, hiddenWordArr, playerGuess);

                    if (!playerIndex.isEmpty()) {
                        for (int index : playerIndex) {
                            hiddenWordArr.set(index, playerGuess);
                        }
                    } else {
                        attempts++;
                        System.out.println("Wrong guess.");
                    }
                    System.out.println(String.join("", hiddenWordArr));
                    System.out.println("Attempts remaining: " + (maxAttempts - attempts));
                }
                if (hiddenWordArr.equals(wordArray)) {
                    System.out.println("Congratulations! You've beaten the HangMan!");
                } else {
                    System.out.println("You've been caught by the hangman. Prepare to hang... ");
                }
            } else if (playerChoice.equals("2")) {
                System.out.println("Thanks for playing");
                break;
            }
        }
    }
}
