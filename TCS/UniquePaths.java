
    import java.util.Scanner;

public class UniquePaths {
    public static int findUniquePath(int[][] arr, int n, int m, int i, int j) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        if (i >= n || j >= m || arr[i][j] == 1) {
            return 0;
        }
        return findUniquePath(arr, n, m, i + 1, j) + findUniquePath(arr, n, m, i, j + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int i = 0;
        int j = 0;
        int result = findUniquePath(arr, n, m, i, j);
        System.out.println(result);
        // Free memory (Java handles memory management automatically)
        scanner.close();
    }
}

    

