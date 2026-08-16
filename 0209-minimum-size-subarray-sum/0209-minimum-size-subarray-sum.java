class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0 ;
        int high = 0;
        int sum = nums[0];
        int minLen = Integer.MAX_VALUE;

        while(high < nums.length){
            while(sum >= target){
                int length = (high -low)+1;
                if(length < minLen){
                    minLen = length;
                }
                low++;
                sum -= nums[low-1];
            }
            high++;
            if(high < nums.length){
            sum += nums[high];
            }

        }
        if(minLen == Integer.MAX_VALUE){
            return 0;
        }else{
            return minLen;
        }
    }
}