package DSA;
f
import java.util.*;

public class solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Student in class");
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the roll no. you want to find");
        int x= sc.nextInt();
        int b=0;
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                 System.out.println(i);
                  b++; 
            }
           
        }
       if(b!=0){
        System.out.println(-1);
       } 
       
    }
}
 
