package MathsInDSA;

public class set_ith_bit {
    /*Here the nth bit gives
    1-->1
    0-->1
    */
    public static void main(String[] args) {
        int value = 9;
        System.out.println(BitPos(value,3));
    }
    static int BitPos(int value ,int pos){
        return value | (1 << pos - 1);
        /* Any number & operation with 1
        will give the value ,so here we
        put 1 at the position we want the value.
         */
    }
}
