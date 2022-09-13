class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i==k-1){
                return arr[i];
            }
        }
        return 1;//Your code here
    } 
}
