package MathsInDSA;

public class MagicNumber {
    public static void main(String[] args) {
        System.out.println(returnNUmber(6));
    }
    static int returnNUmber(int n){
        int ans = 0;
        int base = 5;
        while(n > 0) {
            int lastBit = n & 1;
            n = n >>1;
            ans +=(lastBit * base);
            base *=5;
        }

        return ans;
    }
}
