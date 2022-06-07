import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        List<ST> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            input = br.readLine().split(" ");
            list.add(new ST(input[0], Integer.parseInt(input[1])));
        }


        Comparator com = new Comparator<ST>() {

            @Override
            public int compare(ST o1, ST o2) {
                // TODO Auto-generated method stub
                if(o1.score == o2.score){
                    return 0;
                }else{
                    return o2.score - o1.score;
                }
                
            }
            
        };

        list.sort(com);
        for(int i = 0; i < m;i++){
            System.out.println(list.get(i).name);
        }
    }
}

class ST {
    String name;
    int score;

    public ST(String a, int b) {
        this.name = a;
        this.score = b;
    }
}