package folder.task3;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class glass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String In = scanner.nextLine();
        String[] input = In.split(" ", 0);
        int[] Count = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            int count = 0;
            String reg = "[аеёиоуыэюя]";
            Pattern gl = Pattern.compile(reg);
            Matcher entry = gl.matcher(input[i]);
            while (entry.find()) {
                count++;
            }
            Count[i] = count;
        }
        Arrays.sort(Count);
        for (int i = Count.length - 1; i >= 0; i--) {
            for (int j = 0; j < input.length; j++) {
                int c = 0;
                String reg = "[аеёиоуыэюя]";
                Pattern gl = Pattern.compile(reg);
                Matcher entry = gl.matcher(input[j]);
                while (entry.find()) {
                    c++;
                }
                if (Count[i] == c) {
                    System.out.println(input[j] + " - " + c);
                    input[j] = "б";
                }

            }
        }

        System.out.println("\n");
        input = In.split(" ", 0);
        for (int i = 0; i < input.length; i++) {
            String reg = "[аеёиоуыэюя]";
            Pattern gl = Pattern.compile(reg);
            Matcher entry = gl.matcher(input[i]);
            int e = 0;
            entry.find();
            input[i] = input[i].substring(0, entry.start()) +
                    input[i].substring(entry.start(), entry.end()).toUpperCase() +
                    input[i].substring(entry.start() + 1);
            System.out.println(input[i]);
        }
    }

}
