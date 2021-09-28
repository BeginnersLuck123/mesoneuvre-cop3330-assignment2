package ex26;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
public class App {
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your balance?");
        int balance = input.nextInt();
        System.out.println("What is the APR on the card (as a percent)?");
        int APR = input.nextInt();
        System.out.println("What is the monthly payment you can make?");
        int monthly = input.nextInt();

    }
}
