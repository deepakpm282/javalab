package BinarySearching;

public class augosticBs {
    public static void main(String[] args) {
        int [] arr = {-18,-6,-2,0,2,6,14,19,25,34,46};
        int x = augosticbinarysearch(arr,0);
        System.out.println(x);
    }
    static int augosticbinarysearch(int[] arr,int target){
        int start =0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            int mid = start+(end - start) /2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc = true){
                if(target < arr[mid]){
                    end = mid -1;
                } else if (target > arr[mid]) {
                    start = mid+1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid -1;
                } else if (target < arr[mid]) {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}

