/* goal is to find tax withholding for customers based on their income level
 * prompt user for weekly income
 * set value to an int
 * Use if else stament:
 * If income less than $500: return income times .1 as tax rate is 10%
 * Income is greater than/equal to $500 and less than $1500: return income times .15 tax rate is 15%
 * Income is greater than/equal to $1500 and less than $2500: return income times .2 tax rate is 20%
 * Income is greater than/equal to $2500: return income times .3 tax rate is 30% 
 * 
 * 
 * Function Query
 * Return (What is your weekly income?)
 * int income = UserInput
 * 
 * Function TaxCalculator {
 *  IF income < 500 THEN
 * return (income times .1);
 * ELSE IF income income >= 500 && income < 1500 THEN
 * return (income times .15);
 * ELSE IF income income >= 1500 && income < 2500 THEN
 * return (income times .20);
 * ELSE IF income income >= 2500 THEN
 * return (income times .30);
 * ELSE
 * return (please enter a valid number)
 * }
 * 
 * */
 
 import java.util.Scanner;
 //imports scanner and allows user to answer prompt

 public class Withholdings {
     public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        //Creates class for withholdings & creates a new scanner object called userInput
 
        System.out.println("What is your weekly income? No commas or decimals:");
        int income = UserInput.nextInt();
        //Asks user what their income is and  sets value equal to an integer called income

    if (income < 500) {
        System.out.println("your tax withholding is " + (income*.1) + " dollars :(");
    }
    else if (income >= 500 && income < 1500) {
        System.out.println("your tax withholding is " + (income*.15) + "dollars");
    }
    else if (income >= 1500 && income < 2500) {
        System.out.println("your tax withholding is " + (income*.2) + "dollars");
    }
    else if (income >= 2500) {
        System.out.println("your tax withholding is " + (income*.3) + "dollars");
    }
    else {
        System.out.println("please enter a valid number");
    }
    // else if statement that checks users input and multiplies it by appropriate tax withholdings percentage as a devimal

    UserInput.close();
    //closes scanner
    }
}