package Exceptionhandling.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class demoException {
    public static void main(String[] args) throws Exception {
        int i, j, k=0;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner br = new Scanner(System.in);
        i=8;

        try {
            j=Integer.parseInt(br.nextLine());

//            k = i / j;
//            System.out.println(j);
        }
        catch(ArithmeticException e){
            System.out.println( "Found...ArithmeticException");
        }
        catch(NumberFormatException e){
            System.out.println("Trying to convert string to integer...");
        }
        catch(Exception e){
            System.out.println("Unknown Exception....");
        }
        finally{
            System.out.println("Good bye...");
        }

        //System.out.println(" "+i+" "+j+" "+k);
    }
}
