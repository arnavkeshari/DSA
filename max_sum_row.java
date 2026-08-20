package DSA;
public class max_sum_row {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3,4},{2,4,6,8},{1,1,1,1}};
        int maxsum= Integer.MIN_VALUE;
        int row=-1; 
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){

            
                sum+=arr[i][j];
            }
            if(sum>maxsum){
                maxsum=sum;
                row=i;
            }
        }
        System.out.println(maxsum);
    }
}
