package lesson2;

import java.util.Scanner;

public class Homework3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a Word String: ");
        String word = in.nextLine();
        int lengthofWord = word.length();
        System.out.println(word.substring(1, lengthofWord-1));
        in.close();
    }
}


