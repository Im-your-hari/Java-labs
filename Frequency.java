import java.util.*;
public class Frequency{
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String a;
        char b;
        int l,i,c=0;
        System.out.println("Enter a string :: ");
        a=s.nextLine();
        l=a.length();

        System.out.println("Enter a charecter :: ");
        b=s.next().charAt(0);
        for(i=0;i<l;i++){
            if(a.charAt(i)==b){
                c++;
            }
        }
        System.out.println("Frequency of "+b+" is "+c);
    }
}