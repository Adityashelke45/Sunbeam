import java.util.*;
public class Question_14 {
    public static void isPalindrome(String str)
    {
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder(str);
        String rev_str = sb.reverse().toString();
        if(str.equals(rev_str))
        {
            System.out.println(str+" is palindrome");
            return;
        }
        System.out.println(str+" is not Palindrome");
        return;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        isPalindrome(str);

        sc.close();
    }
}
