//Q7. Write a java program to accept a number from user using command line argument and display its table.

import java.util.*;
public class Question_7 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        for(int i = 1; i<=10;i++)
        {
            System.out.println(num+" * "+i+" = "+num*i);
        }
        sc.close();
    }
}
