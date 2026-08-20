package DSA;
import java.util.*;
public class search {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr= new int[n];
       
        for (int i = 0; i<n;i++){
            arr[i]= sc.nextInt();
        }
         System.out.println("Enter the number you want to find");
        int x = sc.nextInt();

        for (int i = 0; i<n;i++){
            if(arr[i]==x){
               
            }
         System.out.println(i);
        }
    }
}
