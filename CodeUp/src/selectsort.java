import java.io.*;
import java.util.*;


public class selectsort {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        int arr[] = new int [n];
        for(int i = 0; i < n ;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        selectsort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }

    private static void selectsort(int[] arr) {
        for(int i = 0; i< arr.length-1;i++){
            int min = i;
            for(int j = i+1; j < arr.length;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
