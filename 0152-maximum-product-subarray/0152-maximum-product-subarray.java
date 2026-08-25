class Solution {
    public int maxProduct(int[] nums) {
        int minending = nums[0];
        int maxending = nums[0];
        int res = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            int val1 = minending*nums[i];
            int val2 = maxending*nums[i];
            int val3 = nums[i];

            minending = Math.min(val1,Math.min(val2,val3));
            maxending = Math.max(val1,Math.max(val2,val3));

            res = Math.max(res,maxending);
        }
        return res;
    }
}