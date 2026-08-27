class Solution {
    public int pivotIndex(int[] nums) {
        int prefixSum[] = new int[nums.length];

        prefixSum[0] = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            prefixSum[i] = nums[i] + prefixSum[i-1];
        }

        int end = nums.length-1;
        for(int i = 0 ; i <= end ; i++){

            if(i == 0){
                if(prefixSum[end] - prefixSum[i] == 0){
                    return 0;
                }
            }
            else if(prefixSum[i-1] == prefixSum[end] - prefixSum[i]){
                return i;
            }
        }

        return -1;
    }
}