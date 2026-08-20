package DSA;
import java.util.Scanner;
public class arr2 {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
int arr[] = new int[size];
for(int a=0;a<size;a++){
arr[a]=sc.nextInt();
}
System.out.println("enter the index");
int ind =sc.nextInt();
for(int a =ind;a<size;a++){
arr[a]=arr[a+1];
if(a==(size-2)){
    arr[a]=0;
}
for(int b=0;b<size;b++){
System.out.println(arr[b]);

}
}
    }
}
