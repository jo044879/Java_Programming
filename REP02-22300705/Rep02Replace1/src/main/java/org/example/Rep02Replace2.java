package org.example;

import java.util.Scanner;


public class Rep02Replace2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userinput;
        System.out.printf("Enter a line of text. \n");

        userinput = input.nextLine();
        System.out.println("You entered: " + userinput);
        int position = userinput.toLowerCase().indexOf("hate");
        System.out.println("First occurrence of \"hate\" is at index: " + position);
    }

}
