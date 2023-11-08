package Recursion.ArrayList_Questions;

import java.util.ArrayList;

/* linear search with recursion if answer is appearing 2
    times then return both indexes without arraylist declaration
    here the return type of the function is arraylist,and pass
    it as a parameter.
 */
public class question_10 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,4,10};
        ArrayList<Integer> ans = search(arr,0,4,new ArrayList<>());
        System.out.println(ans);
    }
    static ArrayList search(int[] arr,int start,int target,ArrayList<Integer> list) {
        if(start == arr.length){
            return list;
        }
        if(arr[start] == target){
            list.add(start);
        }
        return search(arr,++start,target,list);
    }
}
