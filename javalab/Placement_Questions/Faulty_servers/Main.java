package Placement_Questions.Faulty_servers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        String[] arr = {"s1 error","s2 error","s3 success","s4 error","s5 error","s6 error","s7 error"};
        System.out.println(Fault(arr));
    }
    public static String Fault(String[] arr){
        ArrayList<String> newArr = new ArrayList<>();
        Collections.addAll(newArr, arr);
        for (int i = 2; i < newArr.size(); i++) {
            int size = newArr.get(i).length();
            for (int j = 0; j < size; j++) {
                if(newArr.get(i).substring(j).startsWith(" error") && newArr.get(i-1).substring(j).startsWith(" error") && newArr.get(i-2).substring(j).startsWith(" error")){
                    newArr.remove(newArr.get(i));
                    i--;
                }
            }
        }
        return newArr.toString();
    }
}
