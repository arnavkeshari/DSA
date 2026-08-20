package DSA;
import java.util.*;
public class half_arr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        int half = (n+1)/2;

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        for(int i=0;i<half;i++){
            System.out.println(arr[i] + " ");
        }

    }
}
