import java.util.*;
public class Palindrome{
    
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    String a;
    int b=0,i,l;
    System.out.println("Enter a string :: ");
    a= s.nextLine();
    
    l=a.length();
    
    for(i=0;i<l/2;i++){
        if(a.charAt(i)!=a.charAt(l-i-1)){
            b=1;
            break;
        }    
    }

    if(b==0){
        System.out.println(a+" is palindrome...");
    }
    else{
        System.out.println(a+" is not palindrome...");
    }
    
    }
}