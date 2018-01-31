package acmp278;

import java.io.*;
import java.util.Scanner;

public class Main {

    void solve(Scanner in, PrintWriter out) {
        String s = in.next();
        String t = in.next();
        int si = 0;
        for (int ti = 0; ti < t.length(); ti++) {
            if (s.charAt(si) == t.charAt(ti)) {
                si++;
                if (si == s.length()) {
                    out.println("YES");
                    return;
                }
            }
        }
        out.println("NO");
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
