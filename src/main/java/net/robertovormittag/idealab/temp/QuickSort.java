package net.robertovormittag.idealab.temp;

public class QuickSort {


    public static void sort(int[] arr, int left, int right) {

        // base case
        if (arr.length < 2) return;

        int pivot = partition(arr, left, right);

        // from left to pivot-1
        // from pivot-1 to right

        if (left < pivot-1) sort(arr, left, pivot-1);
        if (pivot < right) sort(arr, pivot, right);

    }


    private static int partition(int[] arr, int left, int right) {

        int L = left;
        int R = right;
        int tmp;

        int pivot = arr[(left+right)/2];


        while(L <= R) {

            while(arr[L] < pivot) L++;
            while(arr[R] > pivot) R--;

            if (L <= R) {

                tmp = arr[L];
                arr[L] = arr[R];
                arr[R] = tmp;

                L++;
                R--;
            }

        }

        return L;


    }







}

