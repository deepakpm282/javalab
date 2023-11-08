package Linearsearch;

public class linearsearch {
    public static void main(String[] args) {
            int[] arr={12,43,24,87,-87,9,-13,32};
           int ans = search(arr,87);
        System.out.println(ans);
    }
    static int search(int[] arr,int target){
            if(arr.length == 0){
                return -1;
            }
        for (int index = 0; index < arr.length; index++) {
                if(target == arr[index]){
                    return index;
                }
        }
      return -2;
    }
}
