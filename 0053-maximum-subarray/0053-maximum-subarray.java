class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if(nums == null || nums.length == 0) return 0;
        
        int curr_max = nums[0];
        int res = nums[0];

        for(int i = 1;i<nums.length;i++)
        {
            curr_max = Math.max(nums[i],curr_max+nums[i]);
            res = Math.max(curr_max,res);
        }
        return res;
    }
}