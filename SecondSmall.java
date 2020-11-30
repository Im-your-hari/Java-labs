//HARIKRISHNAN KB 28CS
import java.util.*;
public class SecondSmall
{
    public static void main(String args[])
    {
        int a[] = new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        int i,j,temp;
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Second Smallest element is "+a[1]);
    }
}