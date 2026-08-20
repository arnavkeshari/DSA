package DSA;
import java.util.*; 

        public class rot_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count = 0;
        int[] arr= new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        for(int i = 0; i < n-1; i++) {
            if (arr[i] >= arr[i+1]){
                count++;
            }
        }
        if (count == 1 || count == 0) {
            System.out.println("Array is Sorted");
        }
        else {
            System.out.println("Array is not Sorted");
        }
        }
}
