import java.util.ArrayList;

public class ValidateGuess {

    public static ArrayList<Integer> checkGuess(ArrayList<String> wordArr, ArrayList<String> playerArr, String letter) {
     ArrayList<Integer> indexOccurrences = new ArrayList<>();
        for (int i = 0; i < wordArr.size(); i++) {
            if (wordArr.get(i).equals(letter)) {
                if (playerArr.contains(letter)) {
                    continue;
                }
                indexOccurrences.add(i);
            }
        }
        return indexOccurrences;
    }

    public boolean handleGuessErrors(String playerGuess, ArrayList<String> playerGuesses) {
        if (playerGuess.length() != 1) {
            System.out.println("Please enter a single character.");
            return true;
        }
        if (playerGuesses.contains(playerGuess)) {
            System.out.println("You have already guessed this letter.");
            return true;
        }
        if (playerGuess.matches("\\d")) {
            System.out.println("No numbers!");
            return true;
        }
        if ( !playerGuess.matches("[a-zA-Z]")) {
            System.out.println("Please enter a valid letter");
            return true;
        }
        return false;
    }
}
