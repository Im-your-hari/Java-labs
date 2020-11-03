import java.util.*;

public class Matrix
{
   public static void main(String args[])
   {
   
      int m, n, p, q, sum = 0, c, d, k;
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter Number of Rows and Columns of First Matrix : \n");
      m = in.nextInt();
      n = in.nextInt();
      
      int first[][] = new int[m][n];
      
      System.out.print("Enter First Matrix Elements : \n");
      
      for(c=0 ; c<m; c++)
      {
         for(d=0; d<n; d++)
         {
            first[c][d] = in.nextInt();
         }
      }
 
      System.out.print("Enter Number of Rows and Columns of Second Matrix :\n");
      p = in.nextInt();
      q = in.nextInt();
 
      if ( n != p )
      {
         System.out.print("Matrix of the entered order can't be Multiplied.");
      }
      else
      {
         int second[][] = new int[p][q];
         int mul[][] = new int[m][q];
 
         System.out.print("Enter Second Matrix Elements :\n");
 
         for(c=0; c<p; c++)
         {
            for(d=0; d<q; d++)
            {
               second[c][d] = in.nextInt();
            }
        }
        
        
 
         for(c=0; c<m; c++)
         {
            for(d=0; d<q; d++)
            {   
               for(k=0; k<p; k++)
               {
                  sum = sum + first[c][k]*second[k][d];
               }
 
               mul[c][d] = sum;
               sum = 0;
            }
         }
         System.out.print("Products of matrices.......\n");
 
         for(c=0; c<m; c++)
         {
            for(d=0; d<q; d++)
            {
               System.out.print(mul[c][d] + "\t");
            }
            System.out.print("\n");
         }
      }
	  
   }
}