package Pattern_questions;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.lang.String;
import java.lang.Math;

public class Patterns {
    public static void main(String[] args) {
        patterns5(5);

    }
    static void patterns1 (int n){

            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <=row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    static void patterns2 (int n){

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <=5; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patterns3 (int n){

        for (int row = 0; row <=n ; row++) {
            for (int col = 0; col < n -row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patterns4 (int n){

        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void patterns5 (int n){
        for (int row = 1; row < 2*n; row++) {
            int cols = row > n ? 2*n - row:row;
            for (int col = 0; col <cols ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static  void patterns6 (int n){
        for (int row = 1; row <=n; row++) {
            int spaces =n - row;
            for (int s = 1; s <=spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col <n -spaces ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patterns7(int n){
        for (int row = 1; row <=n ; row++) {
            int colsInrow = row - 1;
            for (int spaces = 1; spaces <=colsInrow ; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=n -colsInrow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patterns8(int n){
        for (int row = 1; row <=n; row++) {
            int spaces = n -row;
            for (int s = 1; s <=spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col < 2*(n - spaces); col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patterns9(int n){
        for (int row = 0; row <n; row++) {
            int spaces = row;
            for (int s =0; s <spaces; s++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols<2*(n-spaces); cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patterns10(int n){
        for (int row = 0; row <n; row++) {
            int spaces = n - row ;
            for (int s =0; s <spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col <=n - spaces; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patterns11(int n){
        for (int row = 0; row <n; row++) {
            int spaces = row ;
            for (int s =0; s <spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=n-spaces; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patterns12(int n){
        for (int row = 0; row < 2*n; row++) {
            int colsInrow = row >=n ?2*n-row-1 : row ;
            for (int s = 0; s < colsInrow; s++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols < n -colsInrow; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static  void patterns13(int n){
        for (int row = 1; row <=5; row++) {
            int spaces = n- row;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            int space2 = 2*(n-spaces);
            for (int cols = 1; cols < space2; cols++) {
                if(row >1 && row <n){
                    if(cols>1 && cols<space2 -1 ){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static  void patterns14(int n){
        for (int row = 1; row <=n; row++) {
            int space = row;
            for (int s = 1; s <=space; s++) {
                System.out.print(" ");
            }int stars = 2*(n - row);
            for (int cols = 0; cols <=stars; cols++) {
                if(row > 1 && row < n){
                    if(cols > 0 && cols < stars ){
                        System.out.print(" ");
                        }else{
                        System.out.print("*");
                    }
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void patterns15(int n){
        for (int row = 1; row < 2 * n; row++) {
            int spaces = row > n ?n -(2*n - row) : n - row;
            for (int s = 1; s <=spaces; s++) {
                System.out.print(" ");
            }
            int stars = row > n ? 2*n - row : row;
            for (int cols = 0; cols <stars; cols++) {
                if(row >0 && row <2 * n){
                    if(cols > 0 && cols < stars-1){
                        System.out.print("  ");
                    }else{
                        System.out.print("* ");
                    }
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void patterns16(int n){
        for (int row = 0; row <n; row++) {
            int spaces = n - row;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
                int ans =(int)Math.pow(11,row);
            for (int cols = 0; cols <1; cols++) {
                System.out.print(ans+" ");


            }
            System.out.println();
        }
    }
    static void patterns17 (int n){

        for (int row = 1; row <=2*n; row++) {
            int colm = row >n ? 2*n - row : row;
            int spaces =n- colm;
            for (int s = 1; s <=spaces; s++) {
                System.out.print("  ");
            }

            for (int col = colm; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= colm; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void patterns18(int n){
        for (int row = 0; row <n; row++) {
            for (int cols = 0; cols <2*n; cols++) {
                int B1stars = 2*(n - row);
                //int B1spaces = 2*n - B1stars;
                if(cols >=B1stars/2 && cols <(B1stars/2)+2*row){
                    System.out.print(" ");
                }else{
                System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int row = 1; row <=n; row++) {
            for (int cols = 0; cols <2*n; cols++) {
                int B2stars = 2*row;
                int B1spaces = 2*n - B2stars;
                if(cols >=B2stars/2 && cols <2*n - row){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
    static void patterns19(int n){
        for (int row = 1; row < 2*n; row++) {
            int stars = row >=1 && row<n ? 2* row : row >n && row <=2*n -1 ?2*(2*n - row) : 2*n;
            for (int cols = 0; cols <2*n; cols++) {
                if(row >=1 && row<=5 ){
                    if(cols >=stars/2 && cols <2*n - row){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }else if(row >n && row <=2*n -1){
                    if(cols>= stars/2 && cols < row){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
    static void patterns20(int n) {
        for (int row = 1; row <= n; row++) {
            for (int cols = 0; cols < n-1; cols++) {
                if(row >1 && row < n){
                    if(cols >0 && cols < n-2){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void patterns21(int n){
        int i =0;
        for(int row =1;row <=n; row++){
            for(int cols = 1;cols <=row; cols++){
                i++;
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void patterns22(int n){
        for (int row = 1; row <=n+1; row++) {
            for (int cols = 1; cols <=row; cols++) {
                if(row % 2 == 0){
                    if(cols % 2!=0){
                        System.out.print("0 ");
                    }else{
                        System.out.print("1 ");
                    }
                }else if(cols %2 == 0){
                    System.out.print("0 ");
                }
                else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
    static void patterns23(int n){

    }
    static void patterns26(int n){
        for (int row = 0; row <=n; row++) {
            for (int cols = 0; cols <=n-row; cols++) {
                System.out.print((row+1)+" ");
            }
            System.out.println();
        }
    }
    static void patterns27(int n){
        int num = 1;
        for (int row = 1; row <n ; row++) {
            for (int s = 1; s <row; s++) {
                System.out.print(" ");
            }
            int stars =2*(n -row);
            for (int cols = 1; cols <=stars; cols++) {
                if(cols >=stars/2){
                    System.out.print("+");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void patterns28 (int n){
        for (int row = 1; row <=2 * n; row++) {
            int colsInrows = row > n ? 2*n - row : row ;

            int spaces = n - colsInrows;
            for (int s =1; s <=spaces; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <=colsInrows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patterns29(int n){
        for (int row = 1; row < 2*n; row++) {
            int stars = row >=1 && row<n ? 2* row : row >n && row <=2*n -1 ?2*(2*n - row) : 2*n;
            for (int cols = 0; cols <2*n; cols++) {
                if(row >=1 && row<=5 ){
                    if(cols >=stars/2 && cols <2*n - row){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }else if(row >n && row <=2*n -1){
                    if(cols>= stars/2 && cols < row){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
    static void patterns30 (int n){
        for (int rows = 1; rows <=n; rows++) {
            for (int spaces = 0; spaces <=2*(n -rows); spaces++) {
                System.out.print(" ");
            }
            for (int cols = rows; cols >=1; cols--) {
                System.out.print(cols+" ");
            }
            for (int cols = 2; cols <=rows ; cols++) {
                System.out.print(cols+" ");
            }
            System.out.println();
        }
    }
    static  void patterns31 (int n){
        n = 2 * n;
        for (int row = 0; row <=n; row++) {
            for (int col = 0; col <=n; col++) {
                int atEveryIndex = 383;
                System.out.println(atEveryIndex);
            }
            System.out.println();
        }
    }

    static void PUR1(int r,int c){
        if(r == 0){
            return;
        }
        if(r > c ){
            System.out.print("* ");
            PUR1(r,++c);
        }else {
            System.out.println();
            PUR1(--r, 0);
        }
    }

    static void PUR2(int r,int c){
        if(r == 0){
            return;
        }
        if(r > c ){
            PUR2(r,++c);
            System.out.print("* ");
        }else {
            PUR2(--r, 0);
            System.out.println();
        }
    }
}
