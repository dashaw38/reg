package folder.task1;

import java.util.Scanner;

public class numderssum {

    public static void main  (String[] args){
        int Sum = 0;
        int size = 5;
        System.out.println("Please enter "  + size + " numbers ");
        int [] Num = new int[size];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<Num.length; i++) {
            Num[i] = scanner.nextInt();
        }

        for (int i=0; i<Num.length; i++){
            Sum = Sum + Num[i];
        }
        System.out.println("Sum is equel to " + Sum + ".");
    }

}
