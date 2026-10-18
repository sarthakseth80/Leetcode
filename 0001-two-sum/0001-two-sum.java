class Solution {
    public int[] twoSum(int[] nums, int target) {
        // O(n^2) --- brute force
        int n = nums.length;
        int sum = 0;

        for(int i=0;i<n;i++){
            for(int j = i+1 ;j<n ; j++){
                sum = nums[i]+nums[j];
                if(sum == target){
                    return new int[] {i,j};
                }
                else if(sum > target ||sum < target){
                    continue;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
