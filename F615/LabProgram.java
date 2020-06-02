import java.util.Scanner;
public class LabProgram {
    public static void main(String args[]) {
      int lastNumber, currentMax, sumNum, averageNum, countNum;
      Scanner input = new Scanner(System.in); 
      lastNumber = input.nextInt();
      currentMax = lastNumber;
      sumNum = 0;
      countNum = 0;
      while(lastNumber >= 0) {
        sumNum = sumNum + lastNumber;
        countNum = countNum + 1;
        if(lastNumber > currentMax)
            currentMax = lastNumber;
        lastNumber = input.nextInt();
      }
      System.out.println((sumNum/countNum) + " " + currentMax);
    }
}
