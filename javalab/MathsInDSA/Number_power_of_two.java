package MathsInDSA;

public class Number_power_of_two {
    public static void main(String[] args) {
        int n = 16;
        int counter = 0;
        while(n > 0){
            int ans = n >> 1;
            if(ans == 1){
                counter++;
            }
        }
    }
}
