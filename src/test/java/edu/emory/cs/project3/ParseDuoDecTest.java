// Test program for cs255 hw2
// DO NOT make any changes to this program
//
// For hw2, you must write another program in file "DuoDec.java"
// that contains the static methods:
//
//         public static int parseDuoDec(String s)
//         public static String toString(int a)
//
// Compile the program (after you have written "DuoDec.java")
// with:
//         javac ParseDuoDecTest.java
//
// and run it with the command:
//         java ParseDuoDecTest
//
package edu.emory.cs.project3;
import edu.emory.cs.project3.DuoDec;


public class ParseDuoDecTest
{
   public static char[] digit
            = {'@', '!', '?', '&', '%', '$', '=', '^', '(', ')', '[', ']'};

   public static void main (String[] args) 
   {
      int i, j, k;
      String s;
      int val;

      System.out.println("Single digit duodecimal number tests....");
      for ( i = 0; i < 12; i ++ )
      {
         s = "" + digit[i];
         val = DuoDec.parseDuoDec( s );

         if ( val != i )
         {
           System.out.println(" ---- FAILED for DuoDec number: " + s);
           System.exit(1);
         }
      }

      for ( i = 1; i < 12; i ++ )
      {
         s = "-" + digit[i];
         val = DuoDec.parseDuoDec( s );

         if ( val != -i )
         {
           System.out.println(" ---- FAILED for DuoDec number: " + s);
           System.exit(1);
         }
      }
      System.out.println("Single digit duodecimal number tests....  PASSED !");

      System.out.println("Two digits duodecimal number tests....");
      for ( i = 1; i < 12; i ++ )
         for ( j = 0; j < 12; j ++ )
         {
            s = "" + digit[i] + digit[j];
            val = DuoDec.parseDuoDec( s );

            if ( val != i*12 + j )
            {
               System.out.println(" ---- FAILED for DuoDec number: " + s);
               System.out.println("      DuoDec.parseDuoDec("+s+") returns "+val);
               System.out.println("      Should return: " + i*12 + j);
               System.exit(1);
            }
         }

      for ( i = 1; i < 12; i ++ )
         for ( j = 0; j < 12; j ++ )
         {
            s = "-" + digit[i] + digit[j];
            val = DuoDec.parseDuoDec( s );

            if ( val != -(i*12 + j) )
            {
               System.out.println(" ---- FAILED for DuoDec number: " + s);
               System.exit(1);
            }
         }
      System.out.println("Two digits duodecimal number tests.... PASSED !!");




      System.out.println("Three digits duodecimal number tests....");
      for ( i = 1; i < 12; i ++ )
         for ( j = 0; j < 12; j ++ )
            for ( k = 0; j < 12; j ++ )
            {
            s = "" + digit[i] + digit[j] + digit[k];
            val = DuoDec.parseDuoDec( s );

            if ( val != i*12*12 + j*12 + k )
            {
               System.out.println(" ---- FAILED for DuoDec number: " + s);
               System.out.println("      DuoDec.parseDuoDec("+s+") returns "+val);
               System.out.println("      Should return: " + (i*12*12 + j*12 + k));
               System.exit(1);
            }
            }

      for ( i = 1; i < 12; i ++ )
         for ( j = 0; j < 12; j ++ )
            for ( k = 0; j < 12; j ++ )
            {
            s = "-" + digit[i] + digit[j] + digit[k];
            val = DuoDec.parseDuoDec( s );

            if ( val != -(i*12*12 + j*12 + k) )
            {
               System.out.println(" ---- FAILED for DuoDec number: " + s);
               System.out.println("      DuoDec.parseDuoDec("+s+") returns "+val);
               System.out.println("      Should return: " + -(i*12*12 + j*12 + k));
               System.exit(1);
            }
            }
      System.out.println("Three digits duodecimal number tests.... PASSED !!");





      System.out.println("Large duodecimal number tests....");
      s = "" + digit[7] + digit[6] + digit[4] + digit[8] + digit[3];
      val = DuoDec.parseDuoDec( s );

      if ( val != (7*12*12*12*12 + 6*12*12*12 + 4*12*12 + 8*12 + 3 ) )
      {
         System.out.println(" ---- FAILED for DuoDec number: " + s);
         System.exit(1);
      }

      s = "-" + digit[8] + digit[0] + digit[1] + digit[2] + digit[5];
      val = DuoDec.parseDuoDec( s );

      if ( val != -(8*12*12*12*12 + 0*12*12*12 + 1*12*12 + 2*12 + 5 ) )
      {
         System.out.println(" ---- FAILED for DuoDec number: " + s);
         System.exit(1);
      }
      System.out.println("Large duodecimal number tests.... PASSED !!\n");

      System.out.println(" ---- All parseDuoDec tests passed !");

   }
}

