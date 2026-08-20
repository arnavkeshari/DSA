package DSA;
import java.util.Scanner;

public class arr{
    public static void main(String arg[]){
         Scanner sc = new Scanner (System.in);
         System.out.println("Enter the size of array: ");
         int n = sc.nextInt();
         int[] arr = new int[n];
         
        
         for (int i =0;i <n; i++){
            arr[i]= sc.nextInt();
         }
         for (int i = 0 ; i<n;i++){
            if (i%2==0){
               arr[i]= arr[i] + 10 ;
            }
            else 
                arr[i] = 2*arr[i];
         
            }
            for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
            
    }
}
  