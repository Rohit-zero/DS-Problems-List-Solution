public class Check_array_is_sorted_or_not{
    public boolean check1(int arr[]) {
        boolean ans = true;
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i]<arr[i+1])
            {

            }else{
                ans = false;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        Check_array_is_sorted_or_not o = new Check_array_is_sorted_or_not();
        System.out.println(o.check1(arr));
    }
}