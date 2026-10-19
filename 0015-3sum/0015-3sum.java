
//3Sum
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
		int n = nums.length;
		Arrays.sort(nums);
		List<List<Integer>> res= new ArrayList<>(); // list 
		for(int i = 0 ; i < n-2 ; i++){
			int left =i+1 ;
			int right =n-1;
			 if(i>0 && nums[i] == nums[i-1])
				continue;
			   int sum = -1 * nums[i];
			while(left<right)
			{
			  int add = nums[left] + nums[right];
			  //check 
			  if(add == sum) {
			   	res.add(Arrays.asList(nums[left] , nums[right] , nums[i] ));
				left++;
				right--;

					while(left < n && nums[left] == nums[left-1]){
						left++;
					}
					while(right > 0 && nums[right]==nums[right+1]){
						right--;
					}
				}
				else if (add > sum) {
					right--;
				}
				else{
					left++;
				}
			}
	    }
	    return res;
	}
}