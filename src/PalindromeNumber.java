import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number : ");
        int num= input.nextInt();
        int reverse=0,rem,temp;
        temp=num;
        while(temp !=0)
        {
            rem=temp%10;
            reverse=reverse*10+rem;
            temp /= 10;
        }
        if(num==reverse)
            System.out.println(num + " palindrome num ");
        else
            System.out.println(num + " not palindrome num ");
    }
}

