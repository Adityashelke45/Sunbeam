import java.util.*;
public class Question_9 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        System.out.println("You entered: "+num);
        int bin = 0;
        int pow = 0;
        while(num!=0)
        {
            int ld = num % 2;
            num /= 2;
            bin = bin + ld * (int)Math.pow(10,pow);
            pow++;
        }

        pow = 0;
        int oct = 0;
        num = temp;
        while(num != 0)
        {
            int ld = num % 8;
            num /= 8;
            oct = oct + ld * (int)(Math.pow(10,pow));
            pow++;
        }

        char hexchar[] = {'0','1','2','3','4','5','6','7','8','9','A',
                            'B','C','D','E','F'};

        num = temp;
        String result = "";
        while(num != 0)
        {
            int ld = num % 16;
            result = hexchar[ld] + result;
            num /= 16;
        }



        System.out.println("Binary equivalent of "+ temp +" is: "+bin);
        System.out.println("Octal equivalent of "+ temp +" is: "+oct);
        System.out.println("Hexadecimal equivalent of "+ temp +" is: "+result);
        sc.close();
    }
}
