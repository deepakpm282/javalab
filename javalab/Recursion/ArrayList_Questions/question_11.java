package Recursion.ArrayList_Questions;

import java.util.ArrayList;

/* linear search with recursion if answer is appearing 2
    times then return both indexes with arraylist declaration
    in the scope of the function.
    In that case for every iteration it will create new object of the list
 */
public class question_11 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,4,10};
        ArrayList<Integer> ans = search(arr,0,4);
        System.out.println(ans);
    }
    static ArrayList search(int[] arr,int start,int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if(start == arr.length){
            return list;
        }
        //This will contain that value at that function call only.
        if(arr[start] == target){
            list.add(start);
        }
        ArrayList<Integer> list2 = search(arr,++start,target);
        list.addAll(list2);

        return list;
    }
}
