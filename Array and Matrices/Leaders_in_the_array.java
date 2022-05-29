public class Leaders_in_the_array {
    public void check_leaders(int arr[]) {
        int last_max=arr[0];
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]>last_max)
            {
                System.out.print(arr[i] + ", ");
                last_max=arr[i];
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {14,5,15,12,8,9,18,15,1,20};
        Leaders_in_the_array o =new Leaders_in_the_array();
        o.check_leaders(arr);
    }
}
