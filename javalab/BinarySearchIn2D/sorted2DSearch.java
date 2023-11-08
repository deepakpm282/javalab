package BinarySearchIn2D;

public class sorted2DSearch {
    public static void main(String[] args) {

    }
        static int binary(int [] arr,int row, int cstart,int cend,int target){

            while(cstart<=cend){
                int mid = cstart+(cend - cstart) /2;

                if(target < arr[mid]){
                    cend = mid -1;
                } else if (target > arr[mid]) {
                    cstart = mid+1;
                } else{
                    return mid;
                }
            }
            return -1;
        }
    static int[] search(int[][] matrix,int target){
        int row = matrix.length;
        int col = matrix[0].length;

        if(row == 1){

        }
        return new int[]{-1,-1};
    }
}
