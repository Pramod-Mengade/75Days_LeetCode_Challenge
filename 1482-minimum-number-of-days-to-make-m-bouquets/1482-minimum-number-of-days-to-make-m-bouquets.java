class Solution {

    public boolean possible(int arr[] , int day , int m , int k){
        int count = 0 ;
        int numberOfB = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] <= day){
                count++;
            }else{
                numberOfB += (count/k);
                count = 0;
            }
        }
        numberOfB += (count/k);

        if(numberOfB >= m){
            return true;
        }else{
            return false;
        }
    }

    public boolean valid(int arr[] , int m , int k){
        if(arr.length < (long)m*k){
            return false;
        }
        return true;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if(valid(bloomDay , m, k) == false){
            return -1;
        }
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int i = 0 ; i < bloomDay.length ; i++){
            if(low > bloomDay[i]){
                low = bloomDay[i];
            }

            if(bloomDay[i] > high){
                high = bloomDay[i];
            }
        }

        while(low <= high){
            int mid = low + (high - low)/2;
        if(possible(bloomDay , mid , m ,k) == true){
            high = mid -1;
        }else{
            low = mid +1;
        }
        }
        return low;
    }
}