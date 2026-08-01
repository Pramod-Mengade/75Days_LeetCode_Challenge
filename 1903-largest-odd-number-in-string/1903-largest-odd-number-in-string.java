class Solution {
    public String largestOddNumber(String num) {
        int arr[] = new int[num.length()];
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < num.length() ; i ++){
            arr[i] = num.charAt(i) -'0';
        }
        int index = -1;
        for(int i = arr.length-1 ; i >=0 ;i--){
            if(arr[i] % 2 == 1){
                index = i;
                break;
            }
        }

        StringBuffer s1 = new StringBuffer();
        for(int i = 0 ; i <= index ; i++){
            s1.append(Integer.toString(arr[i]));
        }

        if(index == -1){
            return "";
        }else{
            return s1.toString();
        }
    }
}