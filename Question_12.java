import java.util.*;
public class Question_12 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] char_array = str.toCharArray();
        int left = 0, right = char_array.length-1;
        while(left<right)
        {
            char temp = char_array[left];
            char_array[left]=char_array[right];
            char_array[right]=temp;
            left++;
            right--;
        }

        String reversed = new String(char_array);
        System.out.println(reversed);


        sc.close();
    }
}
