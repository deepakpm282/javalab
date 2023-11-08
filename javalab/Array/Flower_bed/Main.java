package Array.Flower_bed;

public class Main {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1,0,0};
        boolean ans = canPlaceFlowers(flowerbed,2);
        System.out.println(ans);
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        for (int i = 1; i < flowerbed.length - 1; i++) {
            if (flowerbed[i] == 0 && flowerbed[i+1] == 0 && flowerbed[i-1] == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }
        if (n == 0) {
            return true;
        }
        return false;
    }
}
