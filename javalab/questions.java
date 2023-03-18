package javalab;
import java.util.*;

public class questions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit upto which the prime numbers to occur: ");
        int n = sc.nextInt();
        prime(n);
        
    }

    static void prime(int n){
        // upto a limit 
    //     int i,j,c;
    //  for(i=2;i<=n;i++){
    //     c=0;
    //     for(j=1;j<=i;j++){
    //         if(i%j == 0)
    //         c++;
    //     }
    //     if(c==2)
    //         System.out.print(i+" ");
    int c=2;
    for(int i=2;i*i<=n;i++){
        if(n%c == 0){
            System.out.println("Is not a prime number");
            break;
        }
        c++;
    }
    System.out.println("is a prime number");
    }
}
