class Solution {
    public boolean isPossible(int[] nums, int k, int capacities){
        int count=0;
        int i=0;
        while (i < nums.length) {
            if(nums[i] <= capacities) {
                count++;
                i += 2; 
            }else {
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