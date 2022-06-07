import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<factory> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input[] = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            list.add(new factory(a, b));
        }

        Comparator<factory> cp = new Comparator<factory>() {

            @Override
            public int compare(factory o1, factory o2) {

                return o1.num - o2.num;
            }

        };
        Collections.sort(list, cp);

        Iterator iter = list.iterator();

        while(iter.hasNext()){
            factory str = (factory) iter.next();
            System.out.println(str.num + " " + str.save);
        }
    }

}

class factory {

    int num;
    int save;

    public factory(int a, int b) {
        this.num = a;
        this.save = b;
    }

}
