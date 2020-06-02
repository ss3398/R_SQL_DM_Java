import java.util.Scanner;
public class LabProgram {
   public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in); int inputYear;
       boolean isLeapYear;
       isLeapYear = false; 
       inputYear = scnr.nextInt();
       if ((inputYear%4 == 0 && inputYear%100 != 0) || (inputYear%400 == 0))
        isLeapYear = true;
       System.out.println(inputYear + " - " + ((isLeapYear) ? "leap year" : "not a leap year"));
   } 
}