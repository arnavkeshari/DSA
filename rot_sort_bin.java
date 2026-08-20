package DSA;
import java.util.*;
public class rot_sort_bin{
   public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    int[] arr={5 , 6 , 7 , 8 ,1,2,3,4};
    System.out.println("Enter the key element to search: ");
    int key= sc.nextInt();

    int low=0;
    int high= arr.length -1;
    int found =-1;
    while(low<=high){
        int mid = low+(high-low)/2;
        if(arr[mid]==key){
            found =mid;
            break;
        }
        else if(arr[low]<=arr[mid]){
            if(key>=arr[low]&& key<arr[mid])
             high = mid-1;
            else{
                low =mid+1;
            }
        }
        else{
            if(key>=arr[mid]&& key<=arr[high])
                low = mid+1;
            else
                high = mid-1;
        }
    }
    if(found!=1)
        System.out.println("Element found at index: "+ found);
    else
        System.out.println("Element not found");

   }
}