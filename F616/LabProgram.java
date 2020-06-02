import java.util.Scanner;
public class LabProgram {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in); 
      String inputStr = input.nextLine();
      int matchCount = 0;
      for(int i = 1; i < inputStr.length(); i++) {
        if(inputStr.charAt(i) == inputStr.charAt(0))
            matchCount = matchCount + 1;
      }
      System.out.println(matchCount);
    }
}
