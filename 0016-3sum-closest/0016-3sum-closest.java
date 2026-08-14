class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 0 ; i < nums.length -2 ; i++){
            int left = i +1;
            int right = nums.length -1;

            while(left < right){
                int total = nums[i] + nums[left] + nums[right];
                int diff = 0;

                if(total == target){
                    return target;
                }else if (total < target){
                    diff = target -total;
                    if(diff < minDiff){
                        minDiff = diff;
                        ans = total;
                    }
                    left++;
                }else{
                     diff = total - target;
                    if(diff < minDiff){
                        minDiff = diff;
                        ans = total;
                    }
                    right--;
                }
            }
        }
        return  ans;
    }
}