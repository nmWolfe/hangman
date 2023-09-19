import java.util.ArrayList;
import java.util.Scanner;

public class HangMan {

    private final Scanner scanner;
    private final ConvertWord converter;
    private final Results results;
    private final PlayerInteraction playerInteraction;
    private boolean playing = true;

    public HangMan() {
        this.scanner = new Scanner(System.in);
        this.converter = new ConvertWord();
        this.results = new Results();
        this.playerInteraction = new PlayerInteraction();
    }

    public void startGame() {

        ArrayList<String> playerGuesses = new ArrayList<>();
        ArrayList<String> hiddenWordArray;
        ArrayList<String> wordArray;
        ArrayList<Integer> playerIndex;

        System.out.println("\n");
        System.out.println("*************** Welcome to Hangman ***************");

        while (playing) {

            playerInteraction.showStartOptions();
            String playerChoice = scanner.nextLine();
            String word = Words.generateRandomWord();
            hiddenWordArray = converter.convertToUnderscore(word);
            wordArray = converter.convertWordToArray(word);


            switch (playerChoice) {
                case "1":

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
                        results.hangingMan(attempts);
                        results.displayCurrentArray(hiddenWordArray);
                        results.displayCurrentGuesses(playerGuesses);
                    }
                    playerInteraction.displayGameCompletion(wordArray, hiddenWordArray, playerGuesses);

                    break;
                case "2":
                    playerInteraction.displayRules();
                    break;
                case "3":
                    System.out.println("Thanks for playing");
                    playing = false;
                    break;
            }
        }
    }
}
