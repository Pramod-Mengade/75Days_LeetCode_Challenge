class Solution {
    public int maxSubArray(int[] nums) {
        int bestending = nums[0];
        int ans = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            int val1 = bestending + nums[i];
            int val2 = nums[i];

            bestending = Math.max(val1,val2);

            ans = Math.max(ans, bestending);
        }
        return ans;
    }
}