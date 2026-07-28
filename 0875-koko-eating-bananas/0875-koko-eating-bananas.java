class Solution {
    public int minEatingSpeed(int[] piles, int h) {

       int max = Integer.MIN_VALUE;

       for(int num : piles){
        if(num > max){
            max = num;
        }
       }

       int  low = 1;
       int high = max;

       while(low <= high){
        long totalHour = 0;
        int mid = (low +high)/2;

        for(int i = 0 ; i < piles.length ; i ++){
            double hour = (double)piles[i]/mid;
            totalHour += (int) Math.ceil(hour);
        }

        if(totalHour <= h){
            high = mid-1;
        }else{
            low = mid +1;
        }
       }
       return low ;
    }
}