//Given: Text in English
//TO DO:
//count and return in console unique count of words
//additionally show how many times each of word is displaying in this text
//NOTE: big and small letter is the same and only letters are used for counting

import java.util.HashMap;
import java.util.Map;

public class HomeWorkTwoMainClass {
           public static void main(String[] args) {
            String text = "It is much more difficult to judge oneself than to judge others. If you succeed in judging yourself rightly, then you are indeed a man of true wisdom. Very very very true message.";
            String[] words = text.split(" ");
            System.out.println("GIVEN TEXT: " + text);
            System.out.println(" ");
            System.out.println("*** Count of all words in the given text is: " + words.length);


            HashMap<String, Integer> uniqueWords = new HashMap<>();
            uniqueWords.put("It", 1);
            uniqueWords.put("is", 1);
            uniqueWords.put("much", 1);
            uniqueWords.put("more", 1);
            uniqueWords.put("difficult", 1);
            uniqueWords.put("to", 1);
            uniqueWords.put("judge", 1);
            uniqueWords.put("oneself", 1);
            uniqueWords.put("than", 1);
            uniqueWords.put("to", 2);
            uniqueWords.put("judge", 2);
            uniqueWords.put("others", 1);
            uniqueWords.put("If", 1);
            uniqueWords.put("you", 1);
            uniqueWords.put("succeed", 1);
            uniqueWords.put("in", 1);
            uniqueWords.put("judging", 1);
            uniqueWords.put("yourself", 1);
            uniqueWords.put("rightly", 1);
            uniqueWords.put("then", 1);
            uniqueWords.put("you", 2);
            uniqueWords.put("are", 1);
            uniqueWords.put("indeed", 1);
            uniqueWords.put("a", 1);
            uniqueWords.put("man", 1);
            uniqueWords.put("of", 1);
            uniqueWords.put("true", 1);
            uniqueWords.put("wisdom", 1);
            uniqueWords.put("very", 1);
            uniqueWords.put("very", 2);
            uniqueWords.put("very", 3);
            uniqueWords.put("true", 2);
            uniqueWords.put("message", 1);


            System.out.println("***List of unique words in the given text:");
            for (String i : uniqueWords.keySet()) {
                System.out.println(i);
            }
            System.out.println(" ");
            System.out.println("*** Count of unique words in the given text is: " + uniqueWords.size());

            System.out.println(" ");
            System.out.println("*** Count of each word used in the given text");

            for (Map.Entry<String, Integer> entry : uniqueWords.entrySet()) {
                System.out.println("\t Word: " + entry.getKey() + "\t\t\t\tCount: " + entry.getValue());

            }

        }
    }


