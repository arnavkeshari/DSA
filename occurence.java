package DSA;
import java.util.*;
public class occurence {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int[] arr= {1 , 2 ,4 , 4 ,5 ,5, 6 , 6,7 ,7};
        int key =sc.nextInt();
        int first=-1;
        int last =-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                if (first==-1)
                    first =i;
                last=i;
            }
        }
        System.out.println("First occurence = " + first);
        System.out.println("Last occurence = " + last);
    }
}
