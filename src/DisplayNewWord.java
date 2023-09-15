public class DisplayNewWord {

    private static String word = Words.generateRandomWord();

    public static String returnUnderscoreWord(){
        return " _ ".repeat(word.length());
    }

}
