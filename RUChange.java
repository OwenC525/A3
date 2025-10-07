/**
 * Write the RUChange program inside the main method  according to the 
 * assignment description.
 * 
 * You should read the argument (number of cents due) as an int and then calculate 
 * the least number of coins needed to achieve that amount. Although your able to 
 * only use arithmetic operations to complete the assignment, you should use loops 
 * and conditionals as required by the assignment. You will also have to print out 
 * the number of quarters, dimes, nickles, and pennies needed to obtain that amount 
 * of change.
 * 
 * To compile:
 *        javac RUChange.java
 * To execute:
 *        java RUChange 76
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 * @param args args[0] is the amount in cents to make change for
 * @author Ved Patel
 * @author Anna Lu
 */


public class RUChange {
    public static void main( String [] args ){
        int centsDue = Integer.parseInt(args[0]);
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;

        if (centsDue < 0){
            System.out.println("Invalid input!");
        }

        quarters = (centsDue / 25);
        dimes = ((centsDue % 25) / 10);
        nickels = ((centsDue % 10) / 5);
        pennies = ((centsDue % 5) / 1);

        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: "+ pennies);


    }
 }
