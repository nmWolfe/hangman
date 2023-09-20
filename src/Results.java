import java.util.ArrayList;

public class Results {

    private final ArrayList<String> playerGuesses = new ArrayList<>();

    public ArrayList<String> handlePlayerGuess(String letter) {
        playerGuesses.add(letter);
        return playerGuesses;
    }

    public void displayCurrentArray(ArrayList<String> wordArray) {
        System.out.println(String.join("", wordArray));
    }
    public void displayCurrentGuesses(ArrayList<String> wordArray) {
        System.out.println("Guesses: " + String.join("-", wordArray));
    }

    public void hangingMan(int wrongGuesses) {
        switch (wrongGuesses) {
            case 1: HangManArt.HANGMAN1.display();
                    break;
            case 2: HangManArt.HANGMAN2.display();
                    break;
            case 3: HangManArt.HANGMAN3.display();
                    break;
            case 4: HangManArt.HANGMAN4.display();
                    break;
            case 5: HangManArt.HANGMAN5.display();
                    break;
            case 6: HangManArt.HANGMAN6.display();
                    break;
            case 7: HangManArt.HANGMAN7.display();
                    break;
        }
    }
}

