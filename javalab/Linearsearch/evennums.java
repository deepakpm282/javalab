package Linearsearch;

public class evennums {
    public static void main(String[] args) {
        int[] arr = {10,345,2,6,7896};
        System.out.println(EvenNums(arr));
    }
    static int EvenNums(int[] arr){
       int count = 0;
        for ( int num : arr) {
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    public static boolean even(int num) {
        int numberOfdigits = digits(num);
        return numberOfdigits % 2 ==0;
    }
    public static int digits(int num){
        int count=0;
            while(num>0){
                count++;
                num=num/10;
            }
        return count;
    }
}
