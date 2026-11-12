class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int minVal=arrays.get(0).get(0);
        int maxVal=arrays.get(0).get(arrays.get(0).size()-1);
        int ans=0;
        for(int i=1; i<arrays.size(); i++){
            List<Integer> arr = arrays.get(i);
            int currMin=arr.get(0);
            int currMax=arr.get(arr.size()-1);

            ans=Math.max(ans,Math.abs(currMax - minVal));
            ans=Math.max(ans,Math.abs(maxVal - currMin));

            maxVal=Math.max(maxVal,currMax);
            minVal=Math.min(minVal,currMin);

        }
        return ans;
    }
}