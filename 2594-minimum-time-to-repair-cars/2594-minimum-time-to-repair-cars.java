class Solution {
    public boolean isPossible(int[] ranks, int cars, long time){
        long totalCars=0;
        for(int num:ranks){
            long required=(long)Math.sqrt(time/num);
            totalCars+=required;
            if (totalCars >= cars) {
                return true;
            }
        }
        return false;
    }
    public long repairCars(int[] ranks, int cars) {
       long low=1;
       long high=(long) ranks[0] * cars *cars;
       long ans=0;
       for (int rank : ranks) {
            high = Math.min(high, (long) rank * cars * cars);
        }
       while(low<=high){
            long mid=low + (high - low) /2;
            if(isPossible(ranks, cars, mid)){
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