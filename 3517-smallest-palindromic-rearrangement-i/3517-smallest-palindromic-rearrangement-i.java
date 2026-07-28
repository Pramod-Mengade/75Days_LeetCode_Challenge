class Solution {
    public String smallestPalindrome(String s) {
        int count [] = new int[26];

        for(char ch : s.toCharArray()){
            count[ch -'a']++;
        }

        StringBuilder left = new StringBuilder();
        StringBuilder middle = new StringBuilder();

        for(int i =0 ; i < 26 ; i++){
           int c = count[i];
        

        for(int j = 0 ; j < c/2 ; j++){
                left.append((char)(i +'a'));
        }
    
         if(c % 2 ==1){
                middle.append((char)(i +'a'));
            }
        }
        StringBuilder right = new StringBuilder(left).reverse();
        return left.toString()+middle.toString()+right.toString();

    }
        
}
