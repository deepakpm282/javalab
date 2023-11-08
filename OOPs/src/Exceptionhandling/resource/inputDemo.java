package Exceptionhandling.resource;

import java.util.Scanner;

public class inputDemo {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        try{
            int i=8;
            int k=0;
            int j=Integer.parseInt(sc.nextLine());
            k=i+j;
            if(k<10){
                throw new ArithmeticException();
            }
            System.out.println("The output is :"+k);

        }
        catch(NumberFormatException e){
            System.out.println("Trying to convert strinng to integer....\n"+e);
        }
        catch(ArithmeticException e){
            System.out.println("value of output is less than 10..");
        }
        finally{
            sc.close();
        }
    }
}
