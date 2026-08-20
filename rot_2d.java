package DSA;
import java.util.Scanner;

public class rot_2d {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
         int[][] arr= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
    }
       for(int j=0;j<m;j++){

          for(int i=n;i<=0;i--){
          System.out.print(arr[j][i]+" ");


    }
    System.out.println();

   }
    
}
}
