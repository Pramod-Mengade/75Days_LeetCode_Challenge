class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalsum = 0;

        for(int i = 0 ; i < nums.length ; i++){
            totalsum += nums[i];
        }

        int bestending = nums[0];

        int maxSum = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            int val1 = bestending + nums[i];
            int val2 = nums[i];

            bestending = Math.max(val1 , val2);

            maxSum = Math.max(maxSum , bestending);
        }

        bestending = nums[0];

        int minSum = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            int val1 = bestending + nums[i];
            int val2 = nums[i];

            bestending = Math.min(val1 , val2);

            minSum = Math.min(minSum , bestending);
        }

        if(maxSum < 0){
            return maxSum;
        }else{
            return Math.max((totalsum -minSum) , maxSum);
        }
    }
}