package Placement_Questions.Character_Count;

public class Main {
    public static void main(String[] args) {
        String string = "abcgdhfgdjsjxyz";
        System.out.println(AlphaNum(string));
    }
    public static int AlphaNum(String str){
        char[] arr = str.toCharArray();
        int count = 0;
        for (int i = arr.length-1; i >0; i--) {
            char ch = arr[i];
            if(ch-1 == arr[i-1]){
                continue;
            } else {
                count++;
            }
        }
        return count;
    }
}
