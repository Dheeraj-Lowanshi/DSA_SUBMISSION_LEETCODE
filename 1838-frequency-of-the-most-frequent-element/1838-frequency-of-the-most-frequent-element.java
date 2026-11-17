class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left=0;
        long sum=0;
        int maxfrq=0;
        for(int right=0; right<nums.length; right++){
            sum+=nums[right];
            long operations=(long)nums[right]*(right-left+1)-sum;
            while(operations > k){
                while (operations > k) {
                    sum -= nums[left];
                    left++;

                    operations = (long) nums[right] * (right - left + 1) - sum;
                }
            }
            maxfrq=Math.max(maxfrq, right-left+1);
        }
        return maxfrq;
    }
}