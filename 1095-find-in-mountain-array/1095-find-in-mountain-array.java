/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findPeak(MountainArray arr){
        int low=0;
        int high=arr.length()-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr.get(mid) < arr.get(mid+1)){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }

    public int applyBinarySearchAsc(MountainArray arr, int target, int low, int high){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr.get(mid) == target) return mid;
            else if(arr.get(mid) < target)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }

    public int applyBinarySearchDsc(MountainArray arr, int target, int low, int high){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr.get(mid) == target) return mid;
            else if (arr.get(mid) < target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=findPeak(mountainArr);
        int left=applyBinarySearchAsc(mountainArr, target,0, peak);
        if(left != -1) return left;
        return applyBinarySearchDsc(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }
}