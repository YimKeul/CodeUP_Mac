import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(pibo(sc.nextInt()));
    }

    private static int pibo(int a) {
        if (a <= 2) {
            return 1;
        }
        return pibo(a - 1) + pibo(a - 2);
    }
}
