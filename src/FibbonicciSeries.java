import java.util.Scanner;
public class FibbonicciSeries {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num=sc.nextInt();
            int a = 0, b = 1;
            System.out.print(a + " , " + b + " , ");
            int nextTerm;
            for (int i = 2; i < num; i++) {
                nextTerm = a + b;
                a = b;
                b = nextTerm;
                System.out.print(nextTerm + " , ");
            }
        }
    }
