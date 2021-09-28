package ex24;
import java.util.Locale;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
public class App
{

    //boolean function takes in two strings and uses a nested for loop to go through them and determine if they are anagrams of each other
    public static boolean isAnagram(String first, String second)
    {
        //converts given strings to lowercase
        first = first.toLowerCase();
        second = second.toLowerCase();
        //returns true if they are the same length and contain the same letters, else if not
        if(first.length() == (second.length()))
        {
            int count = 0;
            for(int i = 0; i < first.length(); i++)
                for(int k = 0; k < first.length(); k++)
                {
                    if(first.charAt(i) == second.charAt(k))
                    {
                        count++;
                    }
                }
            if(count == first.length());
            {
                return true;
            }

        }

       return false;
    }

    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.println("Enter the first string: ");
        String first = input.nextLine(); //Input
        System.out.println("Enter the second string: ");
        String second = input.nextLine(); //Input
        //calls isAnagram function to determine if the two strings are anagrams of each other
        if(isAnagram(first, second)) {
            System.out.println("\"" + first + "\" and \"" + second + "\" are anagrams.");//Output
        }
        else
        {
            System.out.println("Try Again.");//Output
        }
    }
}
