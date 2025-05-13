package BM23AI058;

import java.util.Scanner;
public class Chess {
    public static void main(String[] args) {

        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int n = sc.nextInt();
        String[][] arr = new String[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if ((i + j) % 2 != 0)
                    arr[i][j] = "-";
                else
                    arr[i][j] = "_";
            }

        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.print("\n");
        }
    }
}
