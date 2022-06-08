import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(pac(sc.nextInt()));
    }

    private static int pac(int a) {
        if (a == 1) {
            return 1;
        } else {
            return a * pac(a - 1);
        }
    }
}
