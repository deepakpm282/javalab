package Recursion.Numbers_with_rem;

public class basics{
    public static void main(String[] args) {
        System.out.println(palin(-1));
    }
    static int rev1(int n){
        if (n%10 == n){
            System.out.print(n);
            return n;
        }
        int rem = n%10;
        System.out.print(rem);
        return rev1(n/10);
    }
    static int rev2(int n){
        int digit = (int)Math.log10(n)+1;
        return helper(n,digit);
    }
    static int helper(int n,int digits){
        if(n%10 == n){
            System.out.println(-1%10);
            return n;
        }
        int rem = n%10;
        return rem * (int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }
    static boolean palin(int n){
        if(rev2(n) == n){
            return true;
        }
        return false;
    }
    static int Count_num_of_Zeros(int n,int count){
        if(n == 0){
            return count;
        }
        int rem = n%10;
        if(rem == 0){
            return Count_num_of_Zeros(n/10,count+1);
        }
        return Count_num_of_Zeros(n / 10, count);
    }
}
