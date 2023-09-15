import java.util.ArrayList;
import java.util.Random;

public class Words {

    private static ArrayList<String> words = new ArrayList<>();
    private static Random rand = new Random();

    static {
        words.add("BERSERK");
        words.add("HUMDINGER");
        words.add("GOLLUM");
        words.add("ZAP");
        words.add("TRIUMPH");
        words.add("CHARCOAL");
        words.add("LIMB");
        words.add("CRASH");
        words.add("ASBESTOS");
        words.add("WISH");
        words.add("FALLOUT");
        words.add("DIRGE");
        words.add("POT");
        words.add("ORANGUTAN");
        words.add("REGAL");
        words.add("MAGIC");
        words.add("YURT");
        words.add("KARATE");
        words.add("GRUNGE");
        words.add("VOLATILE");
    }

    public static String generateRandomWord(){
        return words.get(rand.nextInt(words.size()));
    }
}
