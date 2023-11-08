package Placement_Questions.x_y_ZProblem;

public class Main {
    public static void main(String[] args) {
        System.out.println(findMaxNum(4,4,5));
    }
    public static int findMaxNum(int x, int y, int z) {
        if(x - y > z || y - x > z){
            return -1;
        }
        if(x == y){
            return x + z/2;
        }
        if(x < y){
            return y + (z-(y - x))/2;
        } else {
            return x + (z-(x - y))/2;
        }
    }
}
