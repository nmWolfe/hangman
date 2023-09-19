import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Words {

    private static ArrayList<String> words;
    private static Random rand = new Random();
    private Scanner fileScan;

    public void convertTextFileToWordList(){
        while (fileScan.hasNext()){
            words.add(fileScan.nextLine().toUpperCase());
        }
    }
    public Words(String filePath){
        try {
            fileScan = new Scanner(new File(filePath));
            words = new ArrayList<>();
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e.getMessage());
        }
    }

    public static String generateRandomWord(){
        return words.get(rand.nextInt(words.size()));
    }
}
