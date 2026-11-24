import java.util.*;

public class WordCounter {
    public static void main(String[] args) {

        String[] words = {
            "java", "tree", "map", "java",
            "map", "java", "queue"
        };

        Map<String, Integer> counts = new HashMap<>();

        for (String word : words) {
            if(counts.containsKey(word))
            {
                counts.put(word, (counts.get(word) + 1));
            }
            else
            {
                counts.put(word,1);
            }
            // TODO:
            // If the word exists, increase its count.
            // Otherwise, add the word with a count of 1.

        }

        // TODO: Print each word and its frequency.
        Iterator<Map.Entry<String, Integer>> iterator = counts.entrySet().iterator();

        while (iterator.hasNext()) 
        {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // TODO: Print the number of unique words.
        System.out.println("size " + counts.size());
    }
}

