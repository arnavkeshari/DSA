package DSA;
  public class transpose_same {
    public int[][] transpose (int[][] arr){
    for (int i=1;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            int temp=arr[i][j];
            arr[i][j]= arr[j][i];
            arr[j][i]= temp;
        }
    }
    return arr;
    }
}
