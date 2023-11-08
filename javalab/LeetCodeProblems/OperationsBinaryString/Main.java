package LeetCodeProblems.OperationsBinaryString;
public class Main {
    public static void main(String[] args) {
        System.out.println(BinaryString("0C1A1B1C1C1B0A0"));
    }
    public static int BinaryString(String str){
        if(str.length() == 0) return -1;
        char[] arr = str.toCharArray();
        int ans = Integer.MIN_VALUE;
        if(arr[0] == 0) ans = 0 ; else ans = 1;
        for (int i = 1; i <= arr.length-2; i+=2) {
            int val2 = Integer.MIN_VALUE;
            if(arr[i+1] == '0') val2 = 0 ; else val2 = 1;
            if(arr[i] == 'A') ans = ans & val2;
            if(arr[i] == 'B') ans = ans | val2;
            if(arr[i] == 'C') ans = ans ^ val2;
        }
        return ans;
    }
}
