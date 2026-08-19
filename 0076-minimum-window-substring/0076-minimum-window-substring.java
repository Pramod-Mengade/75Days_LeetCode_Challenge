class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()){
            return "";
        }
        int low = 0 ;
        int minSize = Integer.MAX_VALUE;
        String res = "";

        int targetFreq[] = new int [256];
        int currWindowFreq[] = new int [256];

        for(char ch : t.toCharArray()){
            targetFreq[ch]++;
        }

        for(int high = 0 ; high < s.length() ; high++){
            currWindowFreq[s.charAt(high)]++;
            while(isTrue(currWindowFreq , targetFreq)){
                int len = high - low +1;
                if(len < minSize){
                res = s.substring(low , high +1);
                minSize = len;
            }
                currWindowFreq[s.charAt(low)]--;
                low++;
            }
            
        }
        return res;

    }

    public boolean isTrue(int curr[] , int target[]){
        for(int i = 0 ; i < 256 ; i++){
            if(target[i] > curr[i]){
                return false;
            }
        }
        return true;
    }
}