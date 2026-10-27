class Solution {
    public long operation(int[] arr, int m){
        long count=0;
        for(int num:arr){
            count=count+(num-1)/m;
        }
        return count;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int low=1;
        int high=Integer.MIN_VALUE;
        int ans=0;
        for(int num:nums){
            high=Math.max(num,high);
        }
        while(low<=high){
            int mid=low+(high-low)/2;

            if(operation(nums,mid) <= maxOperations){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}