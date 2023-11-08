package BinarySearching;

public class binaryCeiling {
    public static void main(String[] args) {
        int [] arr = {-18,-6,-2,0,2,6,14,19,25,34,46};
        int x = ceiling(arr,47);
        System.out.println(x);
    }
static int ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(target > arr[end]){
                return -2;
            }
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}

