package DSA;
import java.util.*;

public class two_sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int[] arr= new int[n];
       int b =0;
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the number whose sum you want to find");
         int target= sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               if(arr[i]+arr[j]==target){
                System.out.println(arr[i]);
                System.out.println(arr[j]);
                b++;
               }
              
            }
        }
       if(b==0)    
        System.out.println("Sum is not found.");
    }
}
