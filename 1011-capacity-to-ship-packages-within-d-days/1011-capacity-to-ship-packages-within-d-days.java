class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE ;
        int high = 0;
        for(int i = 0 ; i < weights.length ; i++){
            high += weights[i];
            if(weights[i] > low){
                low = weights[i];
            }
        }


        while(low <= high){
            int capacity = low + (high -low)/2;
           int day = requireDays(weights,capacity);

           if(day <= days){
            high = capacity-1;
           }else{
            low = capacity+1;
           }
        }

        return low;
    }

    public int requireDays(int arr[] ,int  capacity){
        int load = 0;
        int day = 1;

        for(int i =  0 ; i < arr.length; i++){
        if(arr[i] + load > capacity){
            day++;
            load = arr[i];
        }else{
            load += arr[i];
        }
        }
        return day;
    }
}