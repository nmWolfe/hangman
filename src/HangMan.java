import java.util.ArrayList;
import java.util.Scanner;

public class HangMan {

    private final Scanner scanner;
    private final ConvertWord converter;
    private final Results results;
    private final PlayerInteraction playerInteraction;
    private final ValidateGuess validator;
    private boolean playing = true;

    public HangMan() {
        this.scanner = new Scanner(System.in);
        this.converter = new ConvertWord();
        this.results = new Results();
        this.playerInteraction = new PlayerInteraction();
        this.validator = new ValidateGuess();
    }

    public void startGame() {

        ArrayList<String> playerGuesses = new ArrayList<>();
        ArrayList<String> hiddenWordArray;
        ArrayList<String> wordArray;
        ArrayList<Integer> playerIndex;

        Words textConverter = new Words("/Users/nmp/development/java/hangman/src/words.txt");
        textConverter.convertTextFileToWordList();

        System.out.println("\n");
        System.out.println("    )\n" +
                " ( /(\n" +
                " )\\())    )         (  (     )       )\n" +
                "((_)\\  ( /(   (     )\\))(   (     ( /(   (\n" +
                " _((_) )(_))  )\\ ) ((_))\\   )\\  ' )(_))  )\\ )\n" +
                "| || |((_)_  _(_/(  (()(_)_((_)) ((_)_  _(_/(\n" +
                "| __ |/ _` || ' \\))/ _` || '  \\()/ _` || ' \\))\n" +
                "|_||_|\\__,_||_||_| \\__, ||_|_|_| \\__,_||_||_|\n" +
                "                   |___/");
        System.out.println("*************** Welcome to Hangman ***************");

        while (playing) {

            playerInteraction.showStartOptions();
            String playerChoice = scanner.nextLine();
            String word = Words.generateRandomWord();
            hiddenWordArray = converter.convertToUnderscore(word);
            wordArray = converter.convertWordToArray(word);


            switch (playerChoice) {
                case "1":

                    System.out.println("************* OK! Let's Play Hangman *************");

                    results.displayCurrentArray(hiddenWordArray);

                    int maxAttempts = 7;
                    int attempts = 0;

                    while (attempts < maxAttempts && !hiddenWordArray.equals(wordArray)) {

                        System.out.println("Enter your guess: ");

                        String playerGuess = scanner.nextLine().toUpperCase();

                        if (validator.handleGuessErrors(playerGuess, playerGuesses)){
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
