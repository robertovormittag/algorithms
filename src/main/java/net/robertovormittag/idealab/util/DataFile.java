package net.robertovormittag.idealab.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataFile {

    public static int[] readNumbers(String fileName, int capacity) throws FileNotFoundException {

        Scanner sc = new Scanner(new File(fileName));
        int[] numbers = new int[capacity];
        int n = 0;
        int index = 0;
        while (sc.hasNextInt()) {
            n = sc.nextInt();
            numbers[index] = n;
            index++;
        }

        return numbers;

    }



}
