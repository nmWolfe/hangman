import java.util.ArrayList;

public class Results {

    private ArrayList<String> playerGuesses = new ArrayList<>();

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
        String[] hangManDrawing = hangManDrawings[wrongGuesses - 1];
        for (String line: hangManDrawing) {
            System.out.println(line);
        }
    }


    private final String[] hangMan1 = {
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
    private final String[] hangMan2 = {
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
    private final String[] hangMan3 = {
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
    private final String[] hangMan4 = {
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
    };
    private final String[] hangMan5 = {
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
    };
    private final String[] hangMan6 = {
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
    };
    private final String[] hangMan7 = {
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

    private final String[] hangManEscaped = {
            "******************************************************************",
            "* ",
            "* #######  #######   #######  #######  #####    #####   ##   ##     #",
            "*  ##  ##   ##  ##   ##  ##   ##  ##   ##  ##  ##   ##   ## ##      #",
            "*  ##       ##  ##   ##       ##       ##  ##  ##   ##  # ### #     #",
            "*  ## ##    ## ##    ## ##    ## ##    ##  ##  ##   ##  ## # ##     #",
            "*  ##       ## ##    ##       ##       ##  ##  ##   ##  ##   ##     #",
            "*  ##       ##  ##   ##  ##   ##  ##   ##  ##  ##   ##  ##   ##  ",
            "* ####     ###  ##  #######  #######  ######    #####   ##   ##     #",
            "* ",
            "******************************************************************"
    };

    private final String[][] hangManDrawings = {hangMan1, hangMan2, hangMan3, hangMan4, hangMan5, hangMan6, hangMan7};


}

