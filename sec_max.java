package DSA;
import java.util.*;
public class sec_max {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int max=0;
        int smax=0;
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }
        for(int i =0;i<n;i++){
            if (arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println("The second largest element of array is"+smax);
    }
}
