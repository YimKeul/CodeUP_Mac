import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        rere(Integer.parseInt(br.readLine()));
    }

    public static void rere(int n) {
        if (n >= 1) {
            System.out.println(n);

            rere(n - 1);

        }

    }
}
