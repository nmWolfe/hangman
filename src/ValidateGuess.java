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
}
