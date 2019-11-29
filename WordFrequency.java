/******************************************************************************
 *  Reads in a text file that adds to a data structure. Using said structure
 *  counts the appearance of each unique word.
 *  %  input.txt
 *  Frog Frog Frog...
 *  dog dog dog...
 *
 *  % wordFrequency < input.txt
 *  100: frog
 *  94: dog
 *
 ******************************************************************************/

import java.util.*;
import java.io.*;

public class WordFrequency {



    public static void main(String[] args) throws FileNotFoundException {
         //inputs of lyrics and stop words
        String fileName = "input.txt";
        String stop = "stopword.txt";
        Scanner input = new Scanner(new File(fileName));
        Scanner stpWrd = new Scanner(new File(stop));
         
         
         

        // Hashmap of lyric input
        Map<String, Integer> wordCounts = new HashMap<String, Integer>();
        while (input.hasNext()) {
            //not case sensitive
            String next = input.next().toLowerCase();
            //if word is not in list, adds
            if (!wordCounts.containsKey(next)) {
                wordCounts.put(next, 1);
            } 
            //if in list adds to counter
            else {
                wordCounts.put(next, wordCounts.get(next) + 1);
            }
        }
        
        // Hashmap of common stopwords for comparison
        Map<String, Integer> stopList = new HashMap<String, Integer>();
        while (stpWrd.hasNext()) {
            String stp = stpWrd.next().toLowerCase();
                stopList.put(stp, 1);
        }
        //total of input.txt
        System.out.println("Total words = " + wordCounts.size());
        //remove stopwords
        wordCounts.keySet().removeAll(stopList.keySet());
        //total after removing comparison
        System.out.println("Total words after removing stopwords = " + wordCounts.size());
        //min for word count
        int min = 1;
        //if ateast one word, will show
        for (String word : wordCounts.keySet()) {
            int count = wordCounts.get(word);
            if (count >= min) {
                System.out.println(count + ":\t" + word);
            }
        }
    }
}