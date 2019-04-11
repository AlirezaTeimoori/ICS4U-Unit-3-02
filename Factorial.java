
//---------------------------------------
//-- Created by:     Alireza Teimoori  --
//-- Created on:     Apr 10 2019       --
//-- Created for:    Unit 3-02         --
//-- Course Code:    ICS4U             --
//-- Teacher Name:   Chris Atkinson    --
//---------------------------------------
//-- This program calculates factorial --
//-- using a recursive function        --
//---------------------------------------

// Import requred packages:
import java.math.BigInteger;
import java.util.Scanner;

class Factorial{

    // Instantiate Scanner:
    public static Scanner scanner = new Scanner(System.in);

    // factorial() calculates the factorial for every given Biginteger type input:
    public static BigInteger factorial(BigInteger number) { // number is the input
        
        // Intro variables:
        BigInteger O = new BigInteger("0");
        BigInteger nOne = new BigInteger("-1");
        BigInteger One = new BigInteger("1");

        // If the number is equal to 0, return 1
        if (number.equals(O)) {return One;}

        // number * (number-1)!
        return (number.multiply(factorial(number.add(nOne))));
    }

    public static void main(String[] args) { // Main function

        // Ask for and store data:
        System.out.println("Hello! Please enter the number you want: ");
        BigInteger userinput = new BigInteger(scanner.nextLine());

        // Output:
        System.out.println("The answer is: " + factorial(userinput));

    }
}