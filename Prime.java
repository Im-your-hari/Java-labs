//HARIKRISHNAN KB 28CS
import java.util.Scanner;

public class Prime
{
    public static void main(String args[])
    {
        int num, i, count=0;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter a Number : ");
        num = scan.nextInt();
		
        for(i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.print(num+" is a Prime Number");
        }
        else
        {
            System.out.print(num+" is not a Prime Number");
        }
    }
}