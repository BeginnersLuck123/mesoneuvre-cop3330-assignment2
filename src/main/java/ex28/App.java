package ex28;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
public class App
{
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            total += number;
        }
        System.out.println("The total is " + total + ".");
    }
}
