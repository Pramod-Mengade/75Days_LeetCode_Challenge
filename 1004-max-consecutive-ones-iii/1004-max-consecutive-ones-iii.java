class Solution {
    public int longestOnes(int[] nums, int k) {
        int low = 0 ;
        int high = 0;

        int freq [] = new int[2];

        int len = 0 ; 
        int maxLen = 0;
        int zeroCount = 0;

        while(high < nums.length){
            if(nums[high] == 0){
                zeroCount++;
            }

            while(zeroCount > k){
                if(nums[low] == 0){
                    zeroCount --;
                }
                low++;
            }
            len = high - low+1;
            maxLen = Math.max(maxLen,len);
            high++;
        }
        return maxLen;
    }
}