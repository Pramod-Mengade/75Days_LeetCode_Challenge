class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int minsum = Math.abs(min(nums));
        int maxsum = Math.abs(max(nums));

        return Math.max(minsum , maxsum);
    }
    public int min(int[] arr){
        int bestending = arr[0];
        int result = arr[0];

        for(int i = 1 ; i < arr.length ; i++){
            int val1 = bestending + arr[i];
            int val = arr[i];

            bestending = Math.max(val1 , val);

            result = Math.max(result , bestending);
        }
        return result;
    }

    public int max(int[] arr){
        int bestending = arr[0];
        int result = arr[0];

        for(int i = 1 ; i < arr.length ; i++){
            int val1 = bestending + arr[i];
            int val = arr[i];

            bestending = Math.min(val1 , val);

            result = Math.min(result , bestending);
        }
        return result;
    }
}