package net.robertovormittag.idealab.temp;

public class InsertionSort {


    public static void sort(int[] arr) {

        int j, element;

        for (int index=1; index<arr.length; index++) {

            element = arr[index];
            j = index;

            // find insert location
            while(j > 0 && arr[j-1] > element) {
                arr[j] = arr[j-1];
                j--;
            }

            arr[j] = element;

        }



    }


}
