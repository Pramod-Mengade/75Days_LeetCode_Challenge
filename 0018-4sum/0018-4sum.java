class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length-3 ; i++){
            if(i >0 &&nums[i] == nums[i-1] )continue;

            for(int j = i+1 ; j < nums.length-2 ; j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;

                int left = j+1;
                int right = nums.length-1;

                while(left < right){

                    long total = (long)nums[i] + nums[j] + nums[left] + nums[right];

                    if(total == target){
                        list.add(Arrays.asList(nums[i] ,nums[j] , nums[left] , nums[right]));
                        left++;
                        right--;

                        while(left < nums.length && nums[left] == nums[left-1]){
                            left ++;
                        }

                         while(right > 0 && nums[right] == nums[right+1]){
                            right --;
                        }
                    }else if (total < target ){
                        left ++;
                    }else{
                        right --;
                    }
                }
            }
        }
        return list;
    }
}