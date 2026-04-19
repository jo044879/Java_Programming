package org.example;

import java.util.Scanner;

public class Rep02Replace3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userinput;
        int position = 0;
        while (true) {
            System.out.printf("Enter a line of text. \n");
            userinput = input.nextLine();
            if(userinput.equals("quit")) {
                break;
            }
            System.out.println("I have renhrased that line to read:");
            position = userinput.toLowerCase().indexOf("hate");
            userinput = userinput.substring(0, position) + "love" + userinput.substring(position + 4);
            System.out.println(userinput);
        }
    }
}
