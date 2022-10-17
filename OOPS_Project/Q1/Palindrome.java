package Q1;
import java.util.*;

public class Palindrome {

    static boolean checkPalindrome(String str, int start, int end) 
    { 
        if (start == end) {
            return true;  
        }
        if ((str.charAt(start)) != (str.charAt(end))) {
            return false;
        }
        if (start < end + 1) {
            return checkPalindrome(str, start + 1, end - 1);   
        }
        return true; 
    }   

    // Driver Code 
    public static void main(String args[]) 
    { 
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = in.nextLine();
        int n = str.length();
        boolean isPalindrome = checkPalindrome(str, 0, n - 1);
        if (isPalindrome){
            System.out.println(str + " is a palindrome"); 
        } 
        else {
            System.out.println(str + " is not a palindrome"); 
        }
        in.close();
    }
}