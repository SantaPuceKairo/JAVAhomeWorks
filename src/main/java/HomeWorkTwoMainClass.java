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
        System.out.println("1) ORIGINAL GIVEN TEXT: " + text);
        //Get text in lowerCase, remove dots and comma
        text = text.toLowerCase().replaceAll("  ", "").replace(".", "").replace(",", "");
        System.out.println(" ");
        System.out.println("2) TEXT WITH REMOVED CHARS + IN LOWERCASE: " + text);


//split text in words
        System.out.println(" ");
        String[] words = text.split(" ");
        System.out.println("3) COUNT OF WORDS IS: " + words.length);

//Hashmap

        Map<String, Integer> uniquewords = new HashMap<String, Integer>();

        for (int i=0; i<words.length ; i++) {

            //if word exists in the text, add 1 to the HashMap value
            //words are taken from the massive

            if (uniquewords.containsKey(words[i])) {
                int value = uniquewords.get(words[i]);
                uniquewords.put(words[i], value + 1);
            }
            //otherwise use 1 for the value if the word is unique
            else {

                uniquewords.put(words[i], 1);
            }
        }
        System.out.println(" ");
        System.out.println("4) HASHMAP value / word = Count of used times: ");
        System.out.println(uniquewords);
        System.out.println(" ");
        System.out.println("5) COUNT OF UNIQUE WORDS: " + uniquewords.size());
    }
}










