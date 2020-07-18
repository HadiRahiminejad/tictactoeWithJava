import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int g = 0;
        int t = 0;
        int k = 0;
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        k = sc.nextInt();
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m ; j++) {
                if (array[i][j] == 0) {
                    g += 1;
                }
                if (g == k) {
                    System.out.println(++i);
                    break;
                } else if (array[i][j] == 1) {
                    g = 0;
                }
            }
            if (g == k) {
                break;
            }  else {
                g = 0;
            }
        }
        if (g != k) {
            System.out.println(0);
        }
    }
}
