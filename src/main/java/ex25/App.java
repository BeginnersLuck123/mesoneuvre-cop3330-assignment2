package ex25;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
public class App {
    public static int passwordValidator(String password)
    {
        int numCount = 0;
        int letterCount = 0;
        int charCount = 0;
        String special = "/*!@#$%^&*()\"{}_[]|\\?/<>,.";

        for (int i = 0; i < password.length(); i++)
        {

            if (Character.isDigit(password.charAt(i)))
            {
                numCount++;
            }

            for(int k = 0; k < special.length(); k++)
            {
                char comparison = password.charAt(i);
                if (comparison == special.charAt(k))
                {
                    charCount++;
                }
            }
            if(Character.isAlphabetic(password.charAt(i)))
                letterCount++;


        }

        if(password.length() < 8 && letterCount == 0 && numCount > 0 || password.length() < 8 && letterCount == 0)
        {
            return 1;
        }
        else if(password.length() < 8 && numCount == 0)
        {
            return 2;
        }
        else if(password.length() >= 8 && numCount >= 1 && letterCount > 0 && charCount == 0)
        {
            return 3;
        }
        else if(password.length() >= 8 && numCount >= 1 && letterCount > 0 && charCount > 0)
        {
            return 4;
        }
        return 0;
    }
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        if (passwordValidator(password) == 1) {
            System.out.println("The password " + password + " is a very weak password.");
        }
        else if (passwordValidator(password) == 2) {
            System.out.println("The password " + password + " is a  weak password.");
        }
        else if (passwordValidator(password) == 3) {
            System.out.println("The password " + password + " is a strong password.");
        }
        else if (passwordValidator(password) == 4) {
            System.out.println("The password " + password + " is a very strong password.");
        }
        return;
    }
}
