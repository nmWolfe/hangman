import java.util.ArrayList;

public class PlayerInteraction {

    private final String[] startOptions = {
            "1 - Play a game of HangMan",
            "2 - Quit"
    };
    GameUtilities gameUtil = new GameUtilities();

    public void showStartOptions() {
        for (String option : startOptions) {
            System.out.println(option);
        }
    }

    public void displayGameCompletion(ArrayList<String> currentWord, ArrayList<String> playerGuess) {
        if (playerGuess.equals(currentWord)){
            System.out.println("Congratulations! You've beaten the HangMan!");
        } else {
            System.out.println("You've been caught by the hangman. Prepare to hang... ");
            System.out.println(String.join("", currentWord));
        }
        gameUtil.clearStringArray(currentWord);
        gameUtil.clearStringArray(playerGuess);
    }
}
