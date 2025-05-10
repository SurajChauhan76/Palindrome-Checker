import java.util.Scanner;

public class Main {

    public static void checkPalindrome(String str){
        //[^a-zA-Z]: used to remove non-letters from the string
        String cleanedStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        //Reverse cleaned str using StringBuilder and toString() converts SB back to string
//        String revStr = new StringBuilder(cleanedStr).reverse().toString();

        //Loop method to reverse a string
        String revStr = "";
        for(int i=cleanedStr.length()-1; i>=0; i--){
            revStr += cleanedStr.charAt(i);
        }

        if (cleanedStr.equals(revStr)){
            System.out.println("It is a Palindrome");
        }else {
            System.out.println("It is not a Palindrome");
        }
    }
    public static void main(String[] args) {
        System.out.println("------Palindrome Checker------");
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        checkPalindrome(str);
    }
}