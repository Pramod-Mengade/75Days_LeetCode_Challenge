class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low  = 1;
        int high = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > high){
                high = nums[i];
            }
        }

        int finalAns = high;
        while( low <= high ){
            int mid = low +( high - low )/2;

            int ans = addition(mid,  nums);

            if(ans <= threshold){
                finalAns = mid;
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return finalAns;
    }

    public int addition(int devisor , int[]arr){
        int ans = 0;
        for(int i = 0 ; i < arr.length ; i++){
          ans += (int) Math.ceil((double) arr[i] / devisor);
        }
        return ans;
    }
}