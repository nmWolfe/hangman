import java.util.ArrayList;

public class PlayerInteraction {

    private final String[] startOptions = {
            "1 - Play a game of HangMan",
            "2 - Read me the rules!!!",
            "3 - Quit"
    };
    private final String[] rules = {"****************************************",
            "*  Hangman is a simple word guessing game.",
            "*  Players try to figure out an unknown word by guessing letters.",
            "*  If too many letters which do not appear in the word are guessed...",
            "*  the player hangs...",
            "****************************************",
    };

    GameUtilities gameUtil = new GameUtilities();

    public void showStartOptions() {
        for (String option : startOptions) {
            System.out.println(option);
        }
    }
    public void displayRules() {
        for (String rule: rules) {
            System.out.println(rule);
        }
    }
    public void displayGameCompletion(ArrayList<String> currentWord,
                                      ArrayList<String> playerGuess,
                                      ArrayList<String> previousGuesses) {
        if (playerGuess.equals(currentWord)) {
            System.out.println("Congratulations! You've beaten the HangMan!");
        } else {
            System.out.println("You've been caught by the hangman. Prepare to hang... ");
            System.out.println("The word you were looking for was ... " + String.join("", currentWord));
        }
        gameUtil.clearStringArray(currentWord);
        gameUtil.clearStringArray(playerGuess);
        gameUtil.clearStringArray(previousGuesses);
    }

}
