package DSA;
import java.util.*;
public class insertion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array:");
        int n = sc.nextInt();
        int[] arr= new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the index");
        int index = sc.nextInt();
        System.out.println("Enter the element");
        int a =sc.nextInt();
        for(int i=n;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]= a;
        n++;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        
    }
}
