import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.println(" enter the number : ");
        int num = input.nextInt();
        int reverse=0 , rem;
        while (num != 0) //checks the num is redused to 0 or not
        {
            rem=num%10;
            reverse=reverse*10+rem;
            num /= 10;  //reducing digits in number
        }
        System.out.println("reverse number is : " +reverse );
    }
}
