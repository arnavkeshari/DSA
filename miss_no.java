package DSA;
import java.util.*;
public class miss_no{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        int expsum=(n+1)*(n+2)/2;
        int actsum=0;
       
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        for(int i=0;i<n;i++){
            actsum= actsum+arr[i];
        }
        int miss= expsum-actsum;
        System.out.println(miss);
    }
}