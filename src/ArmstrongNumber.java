import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num= input.nextInt();
        int count=0,a,b,c;
        int sum=0;
        a=num; c=num;
        while (a>0)
        {
           a=a/10;
           count++;
        }
        while (num>0)
        {
            b=num%10;
            sum=(int)(sum+Math.pow(b,count));
            num=num / 10;
        }
        if (sum==c) {
            System.out.println("armstrong number");}
            else {
            System.out.println("not armstrong number");}
        }
    }


