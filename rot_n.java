package DSA;
import java.util.*;
public class rot_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array");
        int n= sc.nextInt();
        int[] arr= new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the key elements");
        int k =sc.nextInt();
        int[] brr= new int[n];
        for(int i=0;i<n ; i++){
            brr[(i+k)%n]=arr[i];
        }
        System.out.println(Arrays.toString(brr));
    }
}
