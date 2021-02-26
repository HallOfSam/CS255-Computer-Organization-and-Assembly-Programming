// Test program for cs255 pj3
// DO NOT make any changes to this program
//
// For pj3, you must write these 2 methods in file "DuoDec.java":
//
//         public static int parseDuoDec(String s)
//         public static String toString(int a)
//
// Compile the program pj3.java program (after you have written 
// these methods in "DuoDec.java") with:
//
//         javac pj3.java
//
// and run it with the command:
//
//         java pj3
//
package edu.emory.cs.project3;

import edu.emory.cs.project3.DuoDec;

import java.util.Scanner;


public class pj3
{
   public static char[] digit
            = {'@', '!', '?', '&', '%', '$', '=', '^', '(', ')', '[', ']'};

   public static void main (String[] args) 
   {
      Scanner in = new Scanner(System.in);

      String s;
      int x, y, z;

      System.out.println("\nHere are the DuoDec digits:\n");

      System.out.print("DuoDec digit:     ");
      for ( int i = 0; i < digit.length; i++ )
          if ( i != 10 )
             System.out.print( digit[i] + "  " );
          else
             System.out.print( digit[i] + "   " );
      System.out.println();

      System.out.print("Value of digit:   ");
      for ( int i = 0; i < digit.length; i++ )
          System.out.print( i + "  " );
      System.out.println("\n");

      System.out.print ("Enter first DuoDec number x = ");
      s = in.next();
      x = DuoDec.parseDuoDec(s);  // Convert septadecimal number to binary

      System.out.print("\n  Debug: x = ");
      PrintBits(x);
      System.out.println("\n  Debug: the decimal value = " + x + "\n");

      System.out.print ("Enter second DuoDec number y = ");
      s = in.next();
      y = DuoDec.parseDuoDec(s);  // Convert septadecimal number to binary

      System.out.print("\n  Debug: y = ");
      PrintBits(y);
      System.out.println("\n  Debug: the decimal value = " + y + "\n");

      z = x + y;
      System.out.print("\n  Debug: x + y = ");
      PrintBits(z);
      System.out.println("\n  Debug: x + y = " + z + "   (in decimal)\n");

      System.out.println("\nx + y = " + DuoDec.toString(z) + "   (in DuoDec)");
      System.out.println ("\n(Check the DuoDec string for correctness !)\n");

   }



   public static void PrintBits(int x)
    {
      int i;

      for (i = 31; i >= 0; i--)
         if ( (x & (1 << i)) != 0 )
            System.out.print("1");
         else
            System.out.print("0");
    }

}

