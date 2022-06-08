import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(sc.nextInt()));
    }

    public static int sum(int a) {
        if (a == 1) {
            return 1;
        } else {
            return a + sum(a - 1);
        }

    }
}
