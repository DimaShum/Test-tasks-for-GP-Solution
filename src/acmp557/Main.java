package acmp557;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private int m;
    private int n;
    private int a;
    private int b;
    private int p;


    /*int[][][] M;

    int[][] multiply(int m) {
        int[][] result = new int[n][n];

        if (m == 1)
            return M[1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    int x = multiply(m - 1)[i][k] * M[m][k][j];
                    if (x >= p) {
                        result[i][j] += x % p;
                    } else {
                        result[i][j] += x;
                    }
                }
                if (result[i][j] >= p)
                    result[i][j] = result[i][j] % p;

            }
        }
        return result;
    }*/

    void solve(Scanner in, PrintWriter out) {
        this.m = in.nextInt();
        this.n = in.nextInt();
        this.a = in.nextInt();
        this.b = in.nextInt();
        this.p = in.nextInt();

        /*M = new int[m + 1][n][n];

        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    M[i][j][k] = in.nextInt();
                }
            }
        }

        out.println(multiply(m)[a-1][b-1]);*/

        try {
            int[][] mA = new int[n][n];
            int[][] mBT = new int[n][n];
            int[][] mC = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mA[i][j] = in.nextInt();
                }
            }

            for (int q = 1; q < m; q++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        mBT[j][i] = in.nextInt();
                    }
                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        mC[i][j] = 0;
                        for (int k = 0; k < n; k++) {
                            int x = mA[i][k] * mBT[j][k];
                            if (x >= p) {
                                mC[i][j] += x % p;
                            } else {
                                mC[i][j] += x;
                            }
                        }
                        if (mC[i][j] >= p)
                            mC[i][j] = mC[i][j] % p;

                    }
                }

                for (int i = 0; i < n; i++) {
                    mA[i] = Arrays.copyOf(mC[i], mC[i].length);
                }
            }

            System.out.println(mA[a - 1][b - 1]);
        } catch (Exception e) {}
    }

    void run() {
        try (
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {

            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}