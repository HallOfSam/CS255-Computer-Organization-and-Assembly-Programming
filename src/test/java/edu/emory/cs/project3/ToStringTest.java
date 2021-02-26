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
//         javac ToStringTest.java
//
// and run it with the command:
//         java ToStringTest
//
package edu.emory.cs.project3;
import edu.emory.cs.project3.DuoDec;


public class ToStringTest
{
   public static char[] digit
            = {'@', '!', '?', '&', '%', '$', '=', '^', '(', ')', '[', ']'};

   public static void main (String[] args) 
   {
      int i, j, k;
      int input;
      String ans;

      System.out.println("Single digit duodecimal number tests....");
      for ( i = 0; i < 12; i ++ )
      {
         input = i;
         ans = DuoDec.toString( input );

         if ( ans.compareTo("" + digit[i]) != 0 )
         {
           System.out.println(" ---- FAILED for value: " + input);
           System.out.println(" Student's answer = '" + ans + "'");
           System.out.println(" Correct answer   = '" + digit[i] + "'");
           System.exit(1);
         }
      }

      for ( i = 1; i < 12; i ++ )
      {
         input = -i;
         ans = DuoDec.toString( input );

         if ( ans.compareTo("-" + digit[i]) != 0 )
         {
           System.out.println(" ---- FAILED for value: " + input);
           System.out.println(" Student's answer = '" + ans + "'");
           System.out.println(" Correct answer   = '-" + digit[i] + "'");
           System.exit(1);
         }
      }
      System.out.println("Single digit duodecimal number tests....  PASSED !");

      System.out.println("Two digits duodecimal number tests....");
      for ( i = 1; i < 12; i ++ )
         for ( j = 0; j < 12; j ++ )
         {
            input = i*12 + j;
            ans = DuoDec.toString( input );

            if ( ans.compareTo("" + digit[i] + digit[j]) != 0 )
            {
              System.out.println(" ---- FAILED for value: " + input);
              System.out.println(" Student's answer = '" + ans + "'");
              System.out.println(" Correct answer   = '" + digit[i] 
				    + digit[j] + "'");
              System.exit(1);
            }

         }

      for ( i = 1; i < 12; i ++ )
         for ( j = 0; j < 12; j ++ )
         {
            input = -(i*12 + j);
            ans = DuoDec.toString( input );

            if ( ans.compareTo("-" + digit[i] + digit[j]) != 0 )
            {
              System.out.println(" ---- FAILED for value: " + input);
              System.out.println(" Student's answer = '" + ans + "'");
              System.out.println(" Correct answer   = '-" + digit[i]
                                    + digit[j] + "'");
              System.exit(1);
            }

         }
      System.out.println("Two digits duodecimal number tests.... PASSED !!");



      System.out.println("Three digits duodecimal number tests....");
      for ( i = 1; i < 12; i ++ )
         for ( j = 0; j < 12; j ++ )
            for ( k = 0; j < 12; j ++ )
            {
            input = i*12*12 + j*12 + k;
            ans = DuoDec.toString( input );

            if ( ans.compareTo("" + digit[i] + digit[j] + digit[k]) != 0 )
            {
              System.out.println(" ---- FAILED for value: " + input);
              System.out.println(" Student's answer = '" + ans + "'");
              System.out.println(" Correct answer   = '" + digit[i] 
				    + digit[j] + digit[k] + "'");
              System.exit(1);
            }

            }

      for ( i = 1; i < 12; i ++ )
         for ( j = 0; j < 12; j ++ )
            for ( k = 0; j < 12; j ++ )
            {
            input = -(i*12*12 + j*12 + k);
            ans = DuoDec.toString( input );

            if ( ans.compareTo("-" + digit[i] + digit[j] + digit[k]) != 0 )
            {
              System.out.println(" ---- FAILED for value: " + input);
              System.out.println(" Student's answer = '" + ans + "'");
              System.out.println(" Correct answer   = '-" + digit[i]
                                    + digit[j] + digit[k] + "'");
              System.exit(1);
            }

         }
      System.out.println("Three digits duodecimal number tests.... PASSED !!");




      System.out.println("Large duodecimal number tests....");
      input = 7*12*12*12*12 + 6*12*12*12 + 4*12*12 + 8*12 + 3;
      ans = DuoDec.toString( input );

      String correct;

      correct = "" + digit[7] + digit[6] + digit[4] + digit[8] + digit[3];


      if ( ans.compareTo( correct ) != 0 )
      {
         System.out.println(" ---- FAILED for value: " + input);
         System.out.println(" Student's answer = '" + ans + "'");
         System.out.println(" Correct answer   = '" + correct + "'");
         System.exit(1);
      }

      input = -(8*12*12*12*12 + 0*12*12*12 + 1*12*12 + 2*12 + 5 );
      ans = DuoDec.toString( input );
      correct = "-" + digit[8] + digit[0] + digit[1] + digit[2] + digit[5];

      if ( ans.compareTo( correct ) != 0 )
      {
         System.out.println(" ---- FAILED for value: " + input);
         System.out.println(" Student's answer = '" + ans + "'");
         System.out.println(" Correct answer   = '" + correct + "'");
         System.exit(1);
      }

      System.out.println("Large duodecimal number tests.... PASSED !!\n");

      System.out.println(" ---- All toString tests passed !");

   }
}

