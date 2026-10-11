class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // total < taget (expand) r++
        // total >= taget (store min length and shrink) l++ 

      int res = nums.length+1; // can take Integer.MAX_VALUE       
      int total=0 , l = 0 ;
      for(int r = 0 ; r < nums.length ;r++){
        total += nums[r];
        while(total >= target){
            res = Math.min(res , r-l+1);
            total-=nums[l];
            l++;
        }
      }
      if(res ==nums.length+1) 
            return 0;
      else
       return res;

    }
}