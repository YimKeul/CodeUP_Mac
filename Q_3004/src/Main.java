import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        int val_or [][] = new int [N][2];
        int val[] = new int [N];
        int val_sort[][] = new int [N][2];
        String input [] = br.readLine().split(" ");

        for(int i = 0; i < N;i++){
            val_or[i][0] = Integer.parseInt(input[i]);
            val_or[i][1] = i;
            
            val[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(val);

        for(int i = 0; i< N; i++){
            val_sort[i][0] = val[i];
            val_sort[i][1] = i ; 

        }

        
        for(int i =0 ; i < N ;i++){
            for(int j = 0; j < N;j++){
                if(val_or[i][0] == val_sort[j][0]){
                    val[i] = val_sort[j][1];
                    break;
                }
            }
        
        }




        
        for(int i = 0; i< N;i++){
            System.out.print(val[i] + " ");
        }
    }
}
