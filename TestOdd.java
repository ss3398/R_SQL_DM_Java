import java.util.Scanner;
public class TestOdd{
    public static void main(String[] args) {
        Scanner scnr50 = new Scanner(System.in); //create a scanner
        int userNum;
        userNum = scnr50.nextInt(); //read the value for userNum
        if(userNum%2 == 1 ) {
            System.out.print("The number is odd\n");
        }
        System.out.println("Program finished!");
    }
}