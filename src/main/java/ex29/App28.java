package ex29;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */



public class App28 {


    public static int years(int rate)
    {

        Scanner input = new Scanner(System.in);
        boolean bool = true;
        while (bool) ;
        {
            System.out.println("What is the rate of return?");
            int rate = input.nextInt();
            if (rate == 0 || Character.isDigit(rate) == false)
            {
                System.out.println("Sorry. That's not a valid input");
                System.out.println("What is the rate of return?");
            }


        }




    }
    public static void main( String[] args ) {


        //boolean bool = true;



     //System.out.println("It will take" + 72/rate + " years to double your initial investment");
    }
}
