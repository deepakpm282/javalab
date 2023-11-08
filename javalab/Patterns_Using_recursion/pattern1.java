package Patterns_Using_recursion;

public class pattern1 {
    public static void main(String[] args) {
        trianle(5,0);
    }
    public static void trianle(int row,int col){
        if(row == 0){
            return ;
        }
        if(col < row){
            trianle(row,col+1);

            System.out.print("*");
        } else {
            trianle(row-1,0);
            System.out.println();
        }
    }
}
