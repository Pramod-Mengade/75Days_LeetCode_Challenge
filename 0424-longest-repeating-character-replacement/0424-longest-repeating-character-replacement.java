class Solution {
    public int characterReplacement(String s, int k) {
        int freq [] = new int[256];

        int low = 0 ;
        int res = 0 ;
        int maxCount = 0;

        for(int high = 0 ; high < s.length() ; high++){
              freq[s.charAt(high)]++;

              maxCount = Math.max(maxCount , freq[s.charAt(high)]);
              int len = high - low +1;
              int diff = len - maxCount;

            while( diff > k){
                freq[s.charAt(low)]--;
                low++;
                len = high - low +1;
                diff = len - maxCount;
            }

            res = Math.max(res , len);
        }
        return res;
    }
}