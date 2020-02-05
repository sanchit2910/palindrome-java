import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        String str = "";
        String rstr = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value to check if it is a palindrome");
        str = s.nextLine();
        int l = str.length();
//        System.out.println(l);
        for (int i = l - 1; i >= 0; i--) {
// here we are reversing the value and assigning it into new variable
            rstr = rstr + str.charAt(i);
        }
        if (str.equals(rstr)) 
        {
            System.out.println("Entered value is a palindrome.");
        } else {
            System.out.println("Entered value isn't a palindrome.");
        }
    }
}
