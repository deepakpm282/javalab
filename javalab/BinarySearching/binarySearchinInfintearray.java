package BinarySearching;

public class binarySearchinInfintearray {
    public static void main(String[] args) {
        int[] arr = {-18,-6,-2,0,2,6,14,19,25,34,46,52,65,77,89,99,105};
        int target = 77;
        int ans = range(arr,target);
        System.out.println(ans);
    }
    static int range(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newStart = end+1;
            end = end + (end - start+1)*2;
            start = newStart;
        }
        return search(arr,target,start,end);
    }
    static int search(int [] arr,int target,int start,int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid +1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
