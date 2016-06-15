
package net.robertovormittag.idealab.temp;


public class Algo {


    public int sumElements(int[] arr) {

        if (arr.length == 1) return arr[0];

        int start = 0;
        int end = arr.length - 1;
        int result = 0;

        for (int index = start; index <= end; index++) {
            result += arr[index];
        }

        return result;

    }


    public char[] compute() {

        String paragraph = "It is a lovely day";
        char[] array = new char[paragraph.length()];

        for (int index = 0; index < paragraph.length(); index++) {
            array[index] = paragraph.charAt(index);
        }

        return array;

    }

}
