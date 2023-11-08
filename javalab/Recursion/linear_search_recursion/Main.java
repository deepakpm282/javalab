package Recursion.linear_search_recursion;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        int [] arr = {1,3,5,7,13,17,17,19,24};
        findAllIndexes(arr,0,17);
        System.out.println(list);
    }
    static boolean search(int [] arr, int index,int target){
        if(index == arr.length -1){
            return false;
        }
        return arr[index] == target || search(arr,index+1,target);
    }
    static int findIndex(int[] arr,int index,int target){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndex(arr,index+1,target);
    }
    //if we want to find the indexes of the target(where multiple occurences of the target is there)
    static ArrayList<Integer> list = new ArrayList<>();
    public static void findAllIndexes(int[] arr,int index,int target){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndexes(arr,index+1,target);
    }
    //if you want to pass the arrayList as an argument then
    public static ArrayList findAllIndexes(int[] arr,int index,int target,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndexes(arr,index+1,target,list);
    }
}
