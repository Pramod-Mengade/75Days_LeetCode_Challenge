class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int freq1[] = new int[26];
        int freq2[] = new int[26];

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            freq1[ch -'a']++;
        }

        for(int i = 0 ; i < t.length() ; i++){
        char ch = t.charAt(i);

            freq2[ch -'a']++;
        }

        for(int i = 0 ; i< 26 ; i++){
            if(freq1[i] == freq2[i]){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}