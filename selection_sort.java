package DSA;
import java.util.*;
public class selection_sort {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i]= sc.nextInt();
    }
    int small;
    for(int i=0;i<n;i++){
        small =i;
    for(int j=i+1;j<n;j++){
        if(arr[j]<arr[small]){
            small =arr[j];
        }
    }
     int temp = arr[i];
     arr[i]=arr[small];
     arr[small] =temp;
}
 System.out.println(Arrays.toString(arr));

}
}
