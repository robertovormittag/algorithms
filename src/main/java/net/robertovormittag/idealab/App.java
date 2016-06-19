package net.robertovormittag.idealab;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) throws FileNotFoundException {
    	
        System.out.println( "Entry point" );

        // 5
        int x=0b101;
        // 6
        int y=0b110;
        // 11
        int z=x+y;

        int n = x & y;
        int o = x | y;

        // integer mulitplication by 2^n
        int right = x >> 1;
        // integer division by 2^n
        int left = y << 1;

        System.out.println(x + "+" + y + "=" + z);
        //5+6=11

        //If you want to output in binary format, use Integer.toBinaryString()
        System.out.println(Integer.toBinaryString(x) + " + " + Integer.toBinaryString(y)
                + " = " + Integer.toBinaryString(z));

        //If you want to output in binary format, use Integer.toBinaryString()
        System.out.println(Integer.toBinaryString(x) + " & " + Integer.toBinaryString(y)
                + " = " + Integer.toBinaryString(n));

        //If you want to output in binary format, use Integer.toBinaryString()
        System.out.println(Integer.toBinaryString(x) + " | " + Integer.toBinaryString(y)
                + " = " + Integer.toBinaryString(o));

        //If you want to output in binary format, use Integer.toBinaryString()
        System.out.println(Integer.toBinaryString(x) + " >> 1"
                + " = " + Integer.toBinaryString(left));

        //If you want to output in binary format, use Integer.toBinaryString()
        System.out.println(Integer.toBinaryString(y) + " << 1"
                + " = " + Integer.toBinaryString(right));

        // to set the bit 2 of a number
        int alpha = 0;
        alpha = alpha | 1 << 2;
        System.out.println("Setting the bit 2" + Integer.toBinaryString(alpha));


        // to check if nth bit is set
        if ( (alpha & 1 << 2) != 0) {
            System.out.println(Integer.toBinaryString(alpha) + " bit 2 is set");
        }
        else {
            System.out.println(Integer.toBinaryString(alpha) + " bit 2 is NOT set");
        }


    }
}
