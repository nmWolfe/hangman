import java.util.ArrayList;
import java.util.Scanner;

public class HangMan {

    private final Scanner scanner;
    private final ConvertWord converter;
    private boolean playing = true;

    public HangMan() {
        this.scanner = new Scanner(System.in);
        this.converter = new ConvertWord();
    }

    public void startGame() {

        PlayerInteraction playerInteraction = new PlayerInteraction();
        Results results = new Results();
        ArrayList<String> playerGuesses = new ArrayList<>();
        ArrayList<Integer> playerIndex;

        System.out.println("\n");
        System.out.println("*************** Welcome to Hangman ***************");

        while (playing) {

            playerInteraction.showStartOptions();
            String playerChoice = scanner.nextLine();
            String word = Words.generateRandomWord();
            ArrayList<String> hiddenWordArray = converter.convertToUnderscore(word);
            ArrayList<String> wordArray = converter.convertWordToArray(word);


            if (playerChoice.equals("1")) {

                System.out.println("Ok, let's play. ");

                results.displayCurrentArray(hiddenWordArray);

                int maxAttempts = 7;
                int attempts = 0;

                while (attempts < maxAttempts && !hiddenWordArray.equals(wordArray)) {

                    System.out.println("Enter your guess: ");

                    String playerGuess = scanner.nextLine().toUpperCase();

                    if (playerGuess.length() != 1) {
                        System.out.println("Please enter a single character.");
                        continue;
                    }

                    playerGuesses = results.handlePlayerGuess(playerGuess);
                    playerIndex = ValidateGuess.checkGuess(wordArray, hiddenWordArray, playerGuess);

                    if (!playerIndex.isEmpty()) {
                        for (int index : playerIndex) {
                            hiddenWordArray.set(index, playerGuess);
                        }
                    } else {
                        attempts++;
                        System.out.println("Wrong guess.");
                    }
                    results.displayCurrentArray(hiddenWordArray);
                    results.displayCurrentArray(playerGuesses);
                    System.out.println("Attempts remaining: " + (maxAttempts - attempts));
                    results.hangingMan(attempts);
                }
                playerInteraction.displayGameCompletion(wordArray, hiddenWordArray, playerGuesses);

            } else if (playerChoice.equals("2")) {
                System.out.println("Thanks for playing");
                playing = false;
            }
        }
    }
}
