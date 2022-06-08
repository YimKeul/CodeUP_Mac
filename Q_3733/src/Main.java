import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        List<Gg> list = new ArrayList<>();
        for (long i = a; i <= b; i++) {
            list.add(new Gg(i, ubacksu(i)));
        }

        // for (int i = 0; i < list.size(); i++) {
        // System.out.println(list.get(i).n + " " + list.get(i).len);
        // }

        Comparator com = new Comparator<Gg>() {

            @Override
            public int compare(Gg o1, Gg o2) {
                // TODO Auto-generated method stub
                if (o1.len == o2.len) {
                    return 0;
                } else {
                    return (int) (o2.len - o1.len);
                }

            }

        };

        Collections.sort(list, com);
        System.out.println(list.get(0).n + " " + list.get(0).len);

    }

    public static long ubacksu(long a) {
        if (a == 1) {
            return 1;
        }
        if (a % 2 == 0) {
            return ubacksu(a / 2) + 1;
        } else {
            return ubacksu(3 * a + 1) + 1;
        }

    }
}

class Gg {
    long n;
    long len;

    public Gg(long a, long b) {
        this.n = a;
        this.len = b;
    }
}