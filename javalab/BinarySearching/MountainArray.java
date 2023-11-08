//package BinarySearching;
//public class MountainArray {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 4, 3, 2, 1};
//        int ans = search(arr,6);
//        System.out.println(ans);
//    }
//    static int search (int[] arr,int target){
//        int peak = peakInArray(arr);
//        if(target < peak){
//
//        }
//    }
//    static int peakInArray(int[] arr) {
//        int start = 0;
//        int end = arr.length-1;
//        while(start < end){
//            int mid = start + (end - start)/2;
//            if(arr[mid] < arr[mid+1]){
//                start = mid+1;
//            }
//            else{
//                end = mid;
//            }
//        }
//        return arr[end];
//    }
//    static int binarySearch(int [] arr,int target){
//        int start =0;
//        int end = arr.length-1;
//        while(start<=end){
//            int mid = start+(end - start) /2;
//
//            if(target < arr[mid]){
//                end = mid -1;
//            } else if (target > arr[mid]) {
//                start = mid+1;
//            } else{
//                return mid;
//            }
//        }
//        return -1;
//    }
//}
