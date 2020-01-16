public class Palindrome {

    public static boolean palindromChecker(String ... var) {

        boolean result = false;

// This confirms what the user put in is what is being checked

        System.out.println("Checking these names for palindromes...");
        System.out.println();
        System.out.println("---------------------------------------");

        for(String checkString : var)   {

            System.out.println(checkString);

        } // end of enhanced for loop

        System.out.println("---------------------------------------");
        System.out.println();

// This enhanced for loop steps through each variable that has been entered
        for(String checkString : var)   {

            /*
             * StringBuilder uses its own methods to reverse the string you want and make life much easier
             */

            StringBuilder originalString = new StringBuilder(checkString);
            StringBuilder backwardsString = new StringBuilder(originalString);

             /* 
              * This if-else statement compares the two strings to see if they are equal using .toString() and .equals().
              * If they are equal, then it is a palindrome. If they are not equal, the result will return false.
              */

            if(backwardsString.toString().equals(originalString.reverse().toString()))   {

                result =  true;

            }   else    {

                result = false;

            } // end of else
            
        } // end of enhanced for loop

        return result;

    } // end of palindromChecker


} // end of Palindrome