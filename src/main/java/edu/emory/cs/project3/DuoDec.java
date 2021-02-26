package edu.emory.cs.project3;
import java.util.Arrays;

public class DuoDec
{
   public static char[] digit 
            = {'@', '!', '?', '&', '%', '$', '=', '^', '(', ')', '[', ']'};

   /* ==========================================================
      Return the 2's complement binary representation for the
      DuoDec number given in String s
      ========================================================== */
   public static int parseDuoDec(String s)
   {
      /* ------------------------------------------------------------------
         This loop checks if the input contains an illegal (non-DuoDec) digit
         ------------------------------------------------------------------ */
      for (int i = 0 ; i < s.length(); i++)
      {
         int j = 0;
         while ( j < digit.length )
         {
            if ( s.charAt(i) == digit[j] || s.charAt(i) == '-' )
            {
               break;
            }

            j++;
         }

         if ( j >= digit.length )
         {
            System.out.println("Illegal nano digit found in input: "
                                        + s.charAt(i) );
            System.out.println("A DuoDec digit must be one of these: "
                                + Arrays.toString (digit) );
            System.exit(1);
         }
      }

      // Write the parseDuoDec() code here




      //TODO:
    return 1;
   }

   /* ==========================================================
      Return the String of DuoDec digit that represent the value
      of the 2's complement binary number given in 
      the input parameter 'value'
      ========================================================== */
   public static String toString(int value)
   {
      boolean inputWasNeg;
      int remainder[] = new int[100];
      char digit[] = new char[100];  // Max 100 digits in number
      String result;
      int   nDigits;

      /* ---------------------------------------
         Check if input is negative
         --------------------------------------- */
      if (value < 0)
      {
         inputWasNeg = true;
         value = -value;        // Negate to make input positive
      }
      else inputWasNeg = false;

      /* -------------------------------------------------------
         Get all digit by collecting remainders divided by 10
         ------------------------------------------------------- */
      nDigits = 0;              // Count # digits in number

      if (value ==0) return "@";

      while (value > 0)
      {
         remainder[nDigits] = value % 12;
         nDigits++;

         value = value / 12;
      }
      /* ---------------------------------------------------------
         Convert "digits" to character (ASCII code)
         --------------------------------------------------------- */
      for (int i = 0; i < nDigits; i++)
      {
         digit[i] = toASCII(remainder[i]);
      }

      // Make a string (starting with last remainder)

      result = "";                          // Initialize output string

      for (int i = nDigits-1; i >= 0; i--)
         result = result + digit[i];        // Add next digit

      /* ---------------------------------------------------------
         Prepend '-' if input was negative
         --------------------------------------------------------- */
      if (inputWasNeg) result = "-" + result;

      return result;
   }

    /* ---------------------------------------------------------
          A helper method that returns the ASCII code representation
          of an integer from 0-11
          --------------------------------------------------------- */
   public static char toASCII(int remainder) {

      char output = switch (remainder) {

         case 0 -> (char) (64);
         case 1 -> (char) (33);
         case 2 -> (char) (63);
         case 3 -> (char) (38);
         case 4 -> (char) (37);
         case 5 -> (char) (36);
         case 6 -> (char) (61);
         case 7 -> (char) (94);
         case 8 -> (char) (40);
         case 9 -> (char) (41);
         case 10 -> (char) (91);
         case 11 -> (char) (93);

         default -> '@';
      };

      return output;
   }


   public static void main (String[] args)
   {

       System.out.println(DuoDec.toString(0));


   }


}



