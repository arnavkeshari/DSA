package DSA;
public class transpose {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{2,1,4,5},{3,1,2,6},{4,2,4,3}};
        int temp;

        for(int i=1;i<arr.length-1;i++){
            for(int j=0;j<arr[0].length;j++){
        
                   
                
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
