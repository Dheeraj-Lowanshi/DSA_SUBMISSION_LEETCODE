class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n=skill.length;
        int start=0, end=n-1;
        int target=skill[0]+skill[n-1];
        long ans=0;
        while(start<end){
            if((skill[start]+skill[end]) != target) return -1;
            ans+=(long)(skill[start]*skill[end]);
            start++;
            end--;
        }
        return ans;
    }
}