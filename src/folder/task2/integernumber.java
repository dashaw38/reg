package folder.task2;


import java.util.Scanner;
import java.util.Random;

public class integernumber {


    public static void main(String[] args) {
        //int size = 1;
        System.out.println("Please enter number - ");
        //nt [] Num = new int[size];
        double input = 2.3;
        double dif = input - (int) input;
        if (dif == 0) {
            int x = (int) input;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0 && i != x) {
                    System.out.print(i + ", ");
                }
            }
            System.out.print(x);
        } else {
            System.out.print("Please correct the input number into integer form");
        }

    }
}
