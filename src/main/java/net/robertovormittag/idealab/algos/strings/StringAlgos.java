package net.robertovormittag.idealab.algos.strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringAlgos {


    public static String removeDuplicatesFromString(String str) {

        Set<Character> unique = new LinkedHashSet<>();

        int index;

        for (index = 0; index < str.length(); index++) {
            unique.add(str.charAt(index));
        }

        StringBuffer sb = new StringBuffer();
        for (Character c : unique) {
            sb.append(c);
        }

        return sb.toString();

    }


}
