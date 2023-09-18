import java.util.ArrayList;

public class Results {

    public Results() {
    }

    private ArrayList<String> playerGuesses = new ArrayList<>();
    public ArrayList<String> handlePlayerGuess(String letter){
        playerGuesses.add(letter);
        return playerGuesses;
    }

    public void displayCurrentArray(ArrayList<String> wordArray){
        System.out.println(String.join("", wordArray));
    }
}
