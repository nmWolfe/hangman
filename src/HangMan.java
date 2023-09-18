import java.util.ArrayList;
import java.util.Scanner;

public class HangMan {

    private final String word;
    private final Scanner scanner;
    private final ConvertWord converter;
    private final int maxAttempts = 7;
    private int attempts = 0;
    private boolean playing = true;

    public HangMan() {
        this.scanner = new Scanner(System.in);
        this.word = Words.generateRandomWord();
        this.converter = new ConvertWord();
    }

    public void startGame() {

        PlayerInteraction playerInteraction = new PlayerInteraction();
        Results results = new Results();
        ArrayList<String> hiddenWordArr = converter.convertToUnderscore(word);
        ArrayList<String> wordArray = converter.convertWordToArray(word);

        System.out.println("\n");
        System.out.println("*************** Welcome to Hangman ***************");

        while (playing) {

            playerInteraction.showStartOptions();
            String playerChoice = scanner.nextLine();

            if (playerChoice.equals("1")) {

                System.out.println("Ok, let's play. ");
                results.displayCurrentArray(hiddenWordArr);

                while (attempts < maxAttempts && !hiddenWordArr.equals(wordArray)) {

                    System.out.println("Enter your guess: ");

                    String playerGuess = scanner.nextLine().toUpperCase();

                    if (playerGuess.length() != 1) {
                        System.out.println("Please enter a single character as your guess.");
                        continue;
                    }
                    ArrayList<String> playerGuesses;
                    ArrayList<Integer> playerIndex;
                    playerGuesses = results.handlePlayerGuess(playerGuess);
                    playerIndex = ValidateGuess.checkGuess(wordArray, hiddenWordArr, playerGuess);

                    if (!playerIndex.isEmpty()) {
                        for (int index : playerIndex) {
                            hiddenWordArr.set(index, playerGuess);
                        }
                    } else {
                        attempts++;
                        System.out.println("Wrong guess.");
                    }
                    results.displayCurrentArray(hiddenWordArr);
                    results.displayCurrentArray(playerGuesses);
                    System.out.println("Attempts remaining: " + (maxAttempts - attempts));
                }
                playerInteraction.displayGameCompletion(wordArray, hiddenWordArr);

            } else if (playerChoice.equals("2")) {
                System.out.println("Thanks for playing");
                playing = false;
            }
        }
    }
}
