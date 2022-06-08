import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        rere(Integer.parseInt(br.readLine()));
        
    }
    static void rere(int a){
        if(a == 0){
            return;
        }
        rere(a-1);
        System.out.println(a);
        
    }

}

