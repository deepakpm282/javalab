package BinarySearchIn2D;
import java.util.Arrays;
public class search2D {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3},
                        {4,5,6},
                        {7,8,9} };
        int target = 8;
        int ans[] = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target) {
        int row = 0;
        int col = arr.length-1;

            while(row < arr.length && col >= 0){
                if(arr[row][col] == target){
                    return new int[] {row,col};
                } if (arr[row][col] < target){
                    row++;
                } else {
                    col--;
                }
        }
            return new int[] {-1,-1};
    }
}
