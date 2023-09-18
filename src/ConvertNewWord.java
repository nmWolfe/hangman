import java.util.ArrayList;

public class ConvertNewWord {
    private final ArrayList<String> hiddenWordArray = new ArrayList<>();
    private final ArrayList<String> wordArray = new ArrayList<>();
    public ArrayList<String> convertToUnderscore(String word){
        hiddenWordArray.clear();
        for (int i = 0; i < word.length() ; i++) {
            hiddenWordArray.add(" _ ");
        }
        return hiddenWordArray;
    }

    public ArrayList<String> convertWordToArray(String word){
        wordArray.clear();
        for (int i = 0; i < word.length() ; i++) {
            wordArray.add(String.valueOf(word.charAt(i)));
        }
        return wordArray;
    }

}
