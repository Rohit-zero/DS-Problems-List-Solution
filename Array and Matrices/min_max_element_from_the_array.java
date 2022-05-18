class min_max_element_from_the_array{
    public void min_max_element(int[] arr) {

        // BrutForce Method : Linearly Traversing each element
        // Time complexity = O(N)

        int min=0;
        int max=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }

            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(min + " " + max); 
    }
    public static void main(String[] args) {
        int arr[] = {4,8,9,3,0,1,5,7,12,11,2};
        min_max_element_from_the_array o = new min_max_element_from_the_array();
        o.min_max_element(arr);
    }
}