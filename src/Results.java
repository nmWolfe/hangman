import java.util.ArrayList;

public class Results {

    public Results() {
    }

    private ArrayList<String> playerGuesses = new ArrayList<>();

    public ArrayList<String> handlePlayerGuess(String letter) {
        playerGuesses.add(letter);
        return playerGuesses;
    }

    public void displayCurrentArray(ArrayList<String> wordArray) {
        System.out.println(String.join("", wordArray));
    }

    public void hangingMan(int wrongGuesses) {
        if (wrongGuesses == 1) {
            for (String line: hangMan1){
                System.out.println(line);
            }
        } else if (wrongGuesses == 2) {
            for (String line: hangMan2){
                System.out.println(line);
            }
        } else if (wrongGuesses == 3) {
            for (String line: hangMan3){
                System.out.println(line);
            }
        } else if (wrongGuesses == 4) {
            for (String line: hangMan4){
                System.out.println(line);
            }
        } else if (wrongGuesses == 5) {
            for (String line: hangMan5){
                System.out.println(line);
            }
        } else if (wrongGuesses == 6) {
            for (String line: hangMan6){
                System.out.println(line);
            }
        } else if (wrongGuesses == 7) {
            for (String line: hangMan7){
                System.out.println(line);
            }
        }
    }

    String[] hangMan1 = {
            "****************************************",
            "* -----------------",
            "* |               |",
            "* |               ",
            "* |               ",
            "* |               ",
            "* |               ",
            "* |",
            "* |               ",
            "* ----------------------------",
            "****************************************"
    };
    String[] hangMan2 = {
            "****************************************",
            "* -----------------",
            "* |               |",
            "* |               O",
            "* |                ",
            "* |                ",
            "* |                ",
            "* |",
            "* |                ",
            "* ----------------------------",
            "****************************************"
    };
    String[] hangMan3= {
            "****************************************",
            "* -----------------",
            "* |               |",
            "* |               O",
            "* |              /",
            "* |               ",
            "* |               ",
            "* |",
            "* |               ",
            "* ----------------------------",
            "****************************************"
    };
    String[] hangMan4 = {
            "****************************************",
            "* -----------------",
            "* |               |",
            "* |               O",
            "* |              / \\",
            "* |               ",
            "* |               ",
            "* |",
            "* |               ",
            "* ----------------------------",
            "****************************************"
    };String[] hangMan5 = {
            "****************************************",
            "* -----------------",
            "* |               |",
            "* |               O",
            "* |              / \\",
            "* |               |",
            "* |                ",
            "* |",
            "* |                ",
            "* ----------------------------",
            "****************************************"
    };String[] hangMan6 = {
            "****************************************",
            "* -----------------",
            "* |               |",
            "* |               O",
            "* |              / \\",
            "* |               |",
            "* |              /",
            "* |",
            "* |               ",
            "* ----------------------------",
            "****************************************"
    };String[] hangMan7 = {
            "****************************************",
            "* -----------------",
            "* |               |",
            "* |               O",
            "* |              / \\",
            "* |               |",
            "* |              / \\",
            "* |",
            "* |             R.I.P",
            "* ----------------------------",
            "****************************************"
    };

}

