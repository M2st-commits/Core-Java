import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("The character is a Letter.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("The character is a Digit.");
        } else if (ch == ' ' || ch == '\t' || ch == '\n') {
            System.out.println("The character is a Whitespace.");
        } else {
            System.out.println("The character is a Special Character.");
        }
        
        scanner.close();
    }
}
