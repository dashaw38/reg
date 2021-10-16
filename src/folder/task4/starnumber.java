package folder.task4;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class starnumber {



    public static void main(String[] args) {

        //int[] Num = new int[]{1,4,2,6,8,5,9,0};
        //showNumbers(Num);
        //showNumbers(new int[]{1,0,9,8,4,2,6});
        showNumbers(getNumbers(7));





    }


   private static void showNumbers(int[] input) {




            for (int l = 0; l <= 6; l++) {
                for (int i = 0; i < input.length; i++) {
                    printPattern(input[i], l);
                    System.out.print("        ");
                }
                System.out.print("\n");
            }


    }
    private static void printPattern( int number, int line){
            if (number == 0 && line == 0) {
                System.out.print( " " + "*" + "*" + "*" + " ");
            }
            if (number == 0 && line == 1) {
                System.out.print("*" + " " + " " + " " + "*");
            }
            if (number == 0 && line == 2) {
                System.out.print("*" + " " + " " + " " + "*");
            }
            if (number == 0 && line == 3) {
                System.out.print("*" + " " + " " + " " + "*");
            }
            if (number == 0 && line == 4) {
            System.out.print("*" + " " + " " + " " + "*");
            }
            if (number == 0 && line == 5) {
            System.out.print("*" + " " + " " + " " + "*");
            }
            if (number == 0 && line == 6) {
            System.out.print("*" + " " + " " + " " + "*");
            }
            if (number == 0 && line == 7) {
            System.out.print("" + "*" + "*" + "*" + " ");
        }
            if (number == 1 && line == 0) {
                System.out.print(" " + " " + "*" + " " + " ");
            }
            if (number == 1 && line == 1) {
                System.out.print(" " + "*" + "*" + " " + " ");
            }
            if (number == 1 && line == 2) {
                System.out.print("*" + " " + "*" + " " + " ");
            }
            if (number == 1 && line == 3) {
                System.out.print(" " + " " + "*" + " " + " ");
            }
            if (number == 1 && line == 4) {
                System.out.print(" " + " " + "*" + " " + " ");
            }
            if (number == 1 && line == 5) {
            System.out.print(" " + " " + "*" + " " + " ");
            }
            if (number == 1 && line == 6) {
            System.out.print("*" + "*" + "*" + "*" + "*");
            }
            if (number == 2 && line == 0) {
                System.out.print(" " + "*" + "*" + "*" + " ");
            }
            if (number == 2 && line == 1) {
                System.out.print("*" + " " + " " + " " + "*");
            }
            if (number == 2 && line == 2) {
                System.out.print(" " + " " + " " + "*" + " ");
            }
            if (number == 2 && line == 3) {
                System.out.print(" " + " " + "*" + " " + " ");
            }
            if (number == 2 && line == 4) {
                System.out.print(" " + "*" + " " + " " + " ");
            }
            if (number == 2 && line == 5) {
            System.out.print("*" + " " + " " + " " + " ");
            }
            if (number == 2 && line == 6) {
            System.out.print("*" + "*" + "*" + "*" + "*");
            }
            if (number == 3 && line == 0) {
                System.out.print(" " + "*" + "*" + "*" + " ");
            }
            if (number == 3 && line == 1) {
                System.out.print("*" + " " + " " + " " + "*");
            }
            if (number == 3 && line == 2) {
                System.out.print(" " + " " + " " + "*" + " ");
            }
            if (number == 3 && line == 3) {
                System.out.print(" " + " " + "*" + " " + " ");
            }
            if (number == 3 && line == 4) {
                System.out.print(" " + " " + " " + "*" + " ");
            }
            if (number == 3 && line == 5) {
                System.out.print("*" + " " + " " + " " + "*");
            }
            if (number == 3 && line == 6) {
                System.out.print(" " + "*" + "*" + "*" + " ");
            }
            if (number == 4 && line == 0) {
                System.out.print(" " + " " + " " + "*" + " ");
            }
            if (number == 4 && line == 1) {
                System.out.print(" " + " " + "*" + "*" + " ");
            }
            if (number == 4 && line == 2) {
                System.out.print(" " + "*" + " " + "*" + " ");
            }
            if (number == 4 && line == 3) {
                System.out.print("*" + " " + " " + "*" + " ");
            }
            if (number == 4 && line == 4) {
                System.out.print("*" + "*" + "*" + "*" + "*");
            }
            if (number == 4 && line == 5) {
                System.out.print(" " + " " + " " + "*" + " ");
            }
            if (number == 4 && line == 6) {
                System.out.print(" " + " " + " " + "*" + " ");
            }
            if (number == 5 && line == 0) {
                System.out.print("*" + "*" + "*" + "*" + "*");
            }
            if (number == 5 && line == 1) {
                System.out.print("*" + " " + " " + " " + " ");
            }
            if (number == 5 && line == 2) {
                System.out.print("*" + "*" + "*" + "*" + " ");
            }
            if (number == 5 && line == 3) {
                System.out.print("*" + " " + " " + " " + "*");
            }
            if (number == 5 && line == 4) {
                System.out.print(" " + " " + " " + " " + "*");
            }
            if (number == 5 && line == 5) {
                System.out.print("*" + " " + " " + " " + "*");
            }
            if (number == 5 && line == 6) {
                System.out.print(" " + "*" + "*" + "*" + " ");
            }
            if (number == 6 && line == 0) {
                System.out.print(" " + "*" + "*" + "*" + " ");
            }
            if (number == 6 && line == 1) {
                System.out.print("*" + " " + " " + " " + "*");
            }
            if (number == 6 && line == 2) {
                System.out.print("*" + " " + " " + " " + " ");
            }
            if (number == 6 && line == 3) {
                System.out.print("*" + "*" + "*" + "*" + " ");
            }
            if (number == 6 && line == 4) {
                System.out.print("*" + " " + " " + " " + "*");
            }
            if (number == 6 && line == 5) {
                System.out.print("*" + " " + " " + " " + "*");
            }
            if (number == 6 && line == 6) {
                System.out.print(" " + "*" + "*" + "*" + " ");
            }
            if (number == 7 && line == 0) {
                System.out.print("*" + "*" + "*" + "*" + "*");
            }
            if (number == 7 && line == 1) {
                System.out.print("*" + " " + " " + " " + "*");
            }
            if (number == 7 && line == 2) {
                System.out.print(" " + " " + " " + " " + "*");
            }
            if (number == 7 && line == 3) {
                System.out.print(" " + " " + " " + "*" + " ");
            }
            if (number == 7 && line == 4) {
                System.out.print(" " + " " + "*" + " " + " ");
            }
            if (number == 7 && line == 5) {
                System.out.print(" " + "*" + " " + " " + " ");
            }
            if (number == 7 && line == 6) {
                System.out.print("*" + " " + " " + " " + " ");
            }
            if (number == 8 && line == 0) {
                System.out.print(" " + "*" + "*" + "*" + " ");
            }
            if (number == 8 && line == 1) {
                System.out.print("*" + " " + " " + " " + "*");
            }
            if (number == 8 && line == 2) {
                System.out.print("*" + " " + " " + " " + "*");
            }
            if (number == 8 && line == 3) {
                System.out.print(" " + "*" + "*" + "*" + " ");
            }
            if (number == 8 && line == 4) {
                System.out.print("*" + " " + " " + " " + "*");
            }
            if (number == 8 && line == 5) {
                System.out.print("*" + " " + " " + " " + "*");
            }
            if (number == 8 && line == 6) {
                System.out.print(" " + "*" + "*" + "*" + " ");
            }
            if (number == 9 && line == 0) {
                System.out.print(" " + "*" + "*" + "*" + " ");
            }
            if (number == 9 && line == 1) {
                System.out.print("*" + " " + " " + " " + "*");
            }
            if (number == 9 && line == 2) {
                System.out.print("*" + " " + " " + " " + "*");
            }
            if (number == 9 && line == 3) {
                System.out.print(" " + "*" + "*" + "*" + "*");
            }
            if (number == 9 && line == 4) {
                System.out.print(" " + " " + " " + " " + "*");
            }
            if (number == 9 && line == 5) {
                System.out.print("*" + " " + " " + " " + "*");
            }
            if (number == 9 && line == 6) {
                System.out.print(" " + "*" + "*" + "*" + " ");
            }
        }




    private static int[] getNumbers(int size) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {

            array[i] = random.nextInt(10);

        }
        return array;
    }




}








