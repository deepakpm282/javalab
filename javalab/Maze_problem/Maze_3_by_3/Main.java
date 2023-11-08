package Maze_problem.Maze_3_by_3;

public class Main {
    public static void main(String[] args) {
        System.out.println(count(3,3));
    }
    public static int count(int r , int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);

        return right+left;
    }
}
