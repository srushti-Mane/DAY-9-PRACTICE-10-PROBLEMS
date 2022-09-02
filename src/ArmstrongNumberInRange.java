import java.util.Scanner;
public class ArmstrongNumberInRange {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter a start number : ");
        int start= input.nextInt();
        System.out.println("enter a end number : ");
        int end= input.nextInt();
        int i,num,rem,temp,counter=0;
        for(i=start+1;i<end;i++)
        {
            temp=i;
            num=0;
            while(temp!=0){
                rem=temp%10;
                num=num+rem*rem*rem;
                temp=temp / 10;
            }
            if(i==num){
                if(counter == 0){
                    System.out.println("armstrong number range" +start+ "and" +end+ " : ");
                }
                System.out.println(i + " ");
                counter++;
            }
        }
        if(counter==0)
        {
            System.out.println("no armstrong number");
        }
    }
}
