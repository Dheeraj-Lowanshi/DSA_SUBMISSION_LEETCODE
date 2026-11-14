class Solution {
    public boolean isPossible(int[] nums, int k, int capacities){
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] <= capacities){
                count++;
                i++;
            }
        }
        return count>=k;
    }
    public int minCapability(int[] nums, int k) {
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        int ans=0;
        for(int num:nums){
            low=Math.min(low,num);
            high=Math.max(high,num);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(nums, k, mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}