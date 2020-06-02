import java.util.Scanner;
public class LabProgram {
   public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);
     int numDollars, numQuarters, numDimes, numNickels, numPennies, balPennies;
     System.out.println("Enter the number of pennies");
     numPennies = scnr.nextInt();
     numDollars = numPennies/100;
     balPennies = numPennies - (numDollars*100);
     numQuarters = balPennies/25;
     balPennies = balPennies - (numQuarters*25);
     numDimes = balPennies/10;
     balPennies = balPennies - (numDimes*10);
     numNickels = balPennies/5;
     numPennies = balPennies - (numNickels*5);
     if(numDollars>0)
        System.out.println(numDollars + " " + ((numDollars > 1) ? "Dollars": "Dollar"));
     if(numQuarters>0)
        System.out.println(numQuarters + " " + ((numQuarters > 1) ? "Quarters": "Quarter"));
     if(numDimes>0)
        System.out.println(numDimes + " " + ((numDimes > 1) ? "Dimes": "Dime"));
     if(numNickels>0)
        System.out.println(numNickels + " " + ((numNickels > 1) ? "Nickels": "Nickel"));
     if(numPennies>0)
        System.out.println(numPennies + " " + ((numPennies > 1) ? "Pennies": "Penny"));
     if(numDollars == 0 && numQuarters == 0 && numDimes == 0 && numNickels == 0 && numPennies == 0)
        System.out.println("No change");
} 
}
