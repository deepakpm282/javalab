package BinarySearching;

public class findInMountainarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 4, 3, 2, 1};
        int target = 3;
        int peak = peakInMOuntainArray(arr);
        int ascnd_part = orderignostic(arr,target,0,peak);
        int descnd_part = orderignostic(arr,target,peak+1,arr.length-1);
        System.out.print(ascnd_part+",");
        System.out.println(descnd_part);

    }

    static int peakInMOuntainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = start +(end - start)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }else if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                return mid;
            }
        }
        return arr[start];
    }
    static int orderignostic(int[] arr,int target,int start,int end){
        boolean isAscd = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start)/2;
            if(isAscd == true){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else if(target > arr[mid]){
                    start = mid+1;
                }
                else{
                    return mid;
                }
            }
            else{
                if(target < arr[mid]){
                    start = mid+1;
                }else if(target >arr[mid]){
                    end = mid-1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
}
