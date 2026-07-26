class Solution {
    public int maximumProduct(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        if(nums.length == 1){
            return nums[0];
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
    

        for(int i = 0 ; i < nums.length ; i ++){

            //Largest Three

            if(nums[i] > largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = nums[i];
            }else if(nums[i] > secondLargest){
                thirdLargest = secondLargest;
                secondLargest = nums[i];
            }else if (nums[i] > thirdLargest){
                thirdLargest = nums[i];
            }
            
            //smallest two
             if (nums[i] < smallest){
                secondSmallest = smallest;
                smallest = nums[i];
            }else if(nums[i] < secondSmallest){
                secondSmallest = nums[i];
            }
        }

        if(nums.length == 2){
            return largest*secondLargest;
        }else{
            return Math.max(largest*secondLargest*thirdLargest,
            largest*smallest*secondSmallest);
        }
        
    }
}