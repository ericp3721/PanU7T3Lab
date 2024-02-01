import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("candle");
        words.add("dandelion");
        words.add("eagle");
        words.add("garage");
        words.add("hamburger");
        words.add("imitate");
        words.add("jello");
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).substring(0,1).equals("h")){
                return;
            }
            System.out.println(words.get(i));
        }

    }
}
