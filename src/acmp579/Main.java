package acmp579;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int nPos = 0;
        int nNeg = 0;
        int sumPos = 0;
        int sumNeg = 0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if (x > 0) {
                nPos++;
                sumPos += x;
            } else if (x < 0) {
                nNeg++;
                sumNeg += x;
            }
        }
        in.close();
        try {
            in = new Scanner(new FileReader("input.txt"));
        } catch (IOException e) {
            throw  new Error(e);
        }
        in.nextInt();
        if (sumPos > -sumNeg) {
            out.println(nPos);
            for (int i = 1; i <= n; i++) {
                int x = in.nextInt();
                if (x > 0) {
                    out.print(i + " ");
                }
            }
        } else {
            out.println(nNeg);
            for (int i = 1; i <= n; i++) {
                int x = in.nextInt();
                if (x < 0) {
                    out.print(i + " ");
                }
            }
        }
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
