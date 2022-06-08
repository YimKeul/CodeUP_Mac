import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        odd(a, b);
    }

    public static void odd(int a, int b) {
        if (a > b) {
            return;
        }
        odd(a, b - 1);
        if (b % 2 != 0) {
            System.out.print(b + " ");
        }
    }
}
