class Solution {
    public int[] sortedSquares(int[] nums) {
        int index=0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < 0){
                index = i;
            }
            nums[i] = nums[i]*nums[i];
        }

        int k = 0 ;
        int arr1[] = new int[index+1];
        for(int i = index ; i >=0 ; i--){
            arr1[k] = nums[i];
            k++;
        }

         k = 0 ;
        int arr2[] = new int[nums.length-index-1];
        for(int i = index+1 ; i <nums.length ; i++){
            arr2[k] = nums[i];
            k++;
        }

        int i =0;
        int j =0;
         k =0;
        int result[] = new int[arr1.length+arr2.length];
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] > arr2[j]){
                result[k] = arr2[j];
                j++;
                k++;
            }else{
                result[k] = arr1[i];
                i++;
                k++;
            }
        }

        while(i < arr1.length){
            result[k] = arr1[i];
            i++;
            k++;
        }

        while(j < arr2.length){
            result[k] = arr2[j];
            j++;
            k++;
        }
    return result;
    }
}