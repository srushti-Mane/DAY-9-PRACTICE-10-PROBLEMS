import java.util.Scanner;
public class SumOfDigitsNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number to be sum : ");
        int num = input.nextInt();
        int sum = 0,s;
        while (num > 0) {
            s = num % 10; //extract the digits from the numbers
            sum = sum + s;
            num= num / 10; // number is short by 1 digit
        }
        System.out.println("sum of digits " +sum );
    }
}

