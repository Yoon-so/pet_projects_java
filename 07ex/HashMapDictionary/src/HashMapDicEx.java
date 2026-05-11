import java.util.*;

public class HashMapDicEx {
    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<String, String>();

        dic.put("baby", "a very young child");
        dic.put("love", "an intense feeling of deep affection");
        dic.put("apple", "the round fruit of a tree of the rose family");

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a word: ");
            String word = scanner.next();
            if (word.equals("exit")) {
                System.out.println("Exiting the dictionary.");
                break;
            }
            String meaning = dic.get(word);
            if (meaning != null) {
                System.out.println(meaning);
            } else {
                System.out.println("Word not found in dictionary.");
            }
        }
        scanner.close();
    }
}
