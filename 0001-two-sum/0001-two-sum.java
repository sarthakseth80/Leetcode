class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
    HashMap<Integer, Integer> map = new HashMap<>();
    int idx =0;
    for(int i : nums){
        map.put(i ,idx );
        idx++;
    }
    for(int i =0 ; i< n; i++){
        int need = target - nums[i];

        if(map.containsKey(need) && map.get(need) != i){
            return new int[] {i,map.get(need)};
        }
    }
    
    return new int[] {-1,-1};

    }
}
