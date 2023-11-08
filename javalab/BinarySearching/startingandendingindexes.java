package BinarySearching;
import java.util.Arrays;
public class startingandendingindexes {
    public static void main(String[] args) {
        int[] arr ={5,7,7,7,8,8,9,10};
        int[] x = strndendindx(arr,7);
        System.out.println(Arrays.toString(x));
    }

    static int[] strndendindx(int[] arr, int target) {
        int[] ans ={-1,-1};

        int start = search(arr,target,true);
        int end = search(arr,target,false);
        arr[0]=start;
        arr[1]=end;
        return ans;
    }

    static int search(int[] arr, int target, boolean findstartindex) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if(findstartindex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
