package MathsInDSA;

public class WIthoutDuplicates {
    //program to find the number without duplicate in the array.
    public static void main(String[] args) {
        int[] arr = {2,3,3,2,4,6,4,5,5};
        System.out.println(ans(arr));
    }
    static int ans(int [] arr){
        int unique = 0;
        for(int n : arr){
            unique = unique ^ n ;
        }
        return unique;
    }
}
