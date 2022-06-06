public class mattrix_transpose {
    public int[][] transpose(int[][] arr) {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0;j<arr.length; j++)
            {
                if(i==j)
                {

                }else
                 {
                     int temp=0;
                     temp=arr[i][j];
                     arr[i][j]=arr[j][i];
                     arr[j][i]=temp;
                 }
            }
        }
        return arr;
    }

    public void printt(int[][] arr) {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0;j<arr.length; j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        mattrix_transpose o = new mattrix_transpose();
        o.printt(o.transpose(arr));
    }
}
