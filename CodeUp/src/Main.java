import java.io.*;
import java.util.*;
//code up 1441 burble sort
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int [n] ;
        for (int i = 0; i < n; i++) {
            arr[i]= Integer.parseInt(br.readLine());
        }


        burblesort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void burblesort(int[] arr){
        for(int i =0 ;i<arr.length;i++){
            for(int j =0; j<arr.length-i-1;j++){
                if(arr[j] >arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] =arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
