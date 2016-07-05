package net.robertovormittag.idealab.algos.strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringAlgos {


    public static char[] reverseString(char[] str, int start, int end) {

        if (start < end) {
            swap(str, start, end);
            reverseString(str, start+1, end-1);
        }

        return str;

    }


    private static void swap(char[] str, int start, int end) {

        char tmp = str[start];
        str[start] = str[end];
        str[end] = tmp;

    }


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
