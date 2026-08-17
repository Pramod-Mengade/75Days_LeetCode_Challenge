class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character ,Integer> map =  new HashMap<>();

        int low = 0 ;
        int maxLen = 0;

        for(int high = 0 ; high < s.length() ; high++){

        if(map.containsKey(s.charAt(high))){
            low = Math.max(low ,map.get(s.charAt(high)) +1 );
            int len = high -low +1;
            maxLen = Math.max(maxLen , len);
            map.put(s.charAt(high),high);
        }else{
            map.put(s.charAt(high),high);
            int len = (high - low)+1;
            maxLen = Math.max(maxLen , len);

        }
        }
        return maxLen;
    }
}