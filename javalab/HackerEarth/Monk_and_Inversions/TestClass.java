package HackerEarth.Monk_and_Inversions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for(int i = 0 ; i < T ; i++){
            int N = Integer.parseInt(br.readLine().trim());
            int[][] matrix = new int[N][N];

            // Read matrix elements
            for (int k = 0; k < N; k++) {
                String[] row = br.readLine().trim().split(" ");
                for (int j = 0; j < N; j++) {
                    matrix[k][j] = Integer.parseInt(row[j]);
                }
            }

            // Count inversions
            int inversions = CountInversion(matrix, N);
            System.out.println(inversions);
        }
    }
    public static int CountInversion(int[][] arr, int M){
        int count = 0;
        for (int p = 0; p < M; p++) {
            for (int q = 0; q < M; q++) {
                for (int i = p ; i >= 0; i--) {
                    for (int j = q; j >= 0; j--) {
                        if (arr[i][j] > arr[p][q]) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
