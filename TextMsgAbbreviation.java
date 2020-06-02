import java.util.Scanner;
public class TextMsgAbbreviation {
   public static void main(String[] args) {
    String inputAbbr;
    Scanner scnr = new Scanner(System.in); 
    System.out.println("Input an abbreviation:");
    inputAbbr = scnr.nextLine();
    switch (inputAbbr) {
        case "LOL":
            System.out.println("laughing out loud");
            break;
        case "IDK":
            System.out.println("I don't know");
            break;
        case "BFF":
            System.out.println("best friends forever");
            break;
        case "IMHO":
            System.out.println("in my humble opinion");
            break;
        case "TMI":
            System.out.println("too much information");
            break;
        default:
            System.out.println("Unknown");
    }
  } 
}
