class Solution {
    public int[] applyOperations(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                arr[i]=nums[i] * 2;
                nums[i+1]=0;
            }
            else{
                arr[i]=nums[i];
            }
        }
        arr[nums.length - 1] = nums[nums.length - 1];
        
        int i=0;
        for(int j=0;j<arr.length;j++){
           if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        return arr;
    }
}