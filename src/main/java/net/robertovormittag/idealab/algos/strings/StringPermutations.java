
package net.robertovormittag.idealab.algos.strings;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {

    // the word to permutate
    private String word;

    // constructor
    public StringPermutations(String word) {
        this.word = word;
    }

    // permutate method
    public List<String> permutate() {

        ArrayList<String> permutations = new ArrayList<>();

        // solve the simple problem
        // empty string or single char string
        // has only one permutation
        if (this.word.length() < 2) {
            permutations.add(word);
            return permutations;
        }

        // loop through all chars in word
        // form a simpler word by removing one character
        // get all permuations for the simpler word recursively
        // add the removed char to the front of each simpler word permutation
        for (int index = 0; index < word.length(); index++) {

            String shorter = word.substring(0, index) + word.substring(index + 1);

            StringPermutations sp = new StringPermutations(shorter);
            List<String> list = sp.permutate();

            for (String str : list) {
                permutations.add(word.charAt(index) + str);
            }

        }

        return permutations;
    }

}
