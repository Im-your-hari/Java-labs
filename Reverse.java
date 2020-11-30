//HARIKRISHNAN KB 28CS
import java.util.*;
class Reverse{
    public static void main(String[] args){
        
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Sring :: ");
        String a =s.nextLine();
        String r="";
        int n=a.length();
        for(int i=n-1; i>=0 ; i--){
            r+=a.charAt(i);
        }
        System.out.println("Reverse : "+r);
    }
}