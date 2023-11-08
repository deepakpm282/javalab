package Recursion.Binary_search_Using_Recursion;

public class BinarysearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        System.out.println(search(arr,88,0,arr.length-1));

    }

    static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return search(arr, target, start, mid-1);
        }
        return search(arr, target, mid+1, end);
    }
}

