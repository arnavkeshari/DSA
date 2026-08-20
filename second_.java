package DSA;
import java.util.*;
public class second_{
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int size =sc.nextInt();
    int arr[]=new int[size];
    for(int a =0;a<size;a++){
        arr[a]=sc.nextInt();
    }
int larg =0;int sec =0;
    for(int a =0;a<size;a++){
    if(arr[a]>larg)
        larg=arr[a];
}
    for(int a =0;a<size;a++){
  if(sec<arr[a]&&larg>arr[a])
    sec=arr[a];
} 
if(sec!= 0)
    System.out.println("the second largest is "+sec);
else
    System.out.println("not found");
}
}
