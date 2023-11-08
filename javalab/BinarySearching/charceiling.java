package BinarySearching;

public class charceiling {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j', 'm', 'o', 't'};
        char x = ceiling(arr, 'g');
        System.out.println(x);
    }

    static char ceiling(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
