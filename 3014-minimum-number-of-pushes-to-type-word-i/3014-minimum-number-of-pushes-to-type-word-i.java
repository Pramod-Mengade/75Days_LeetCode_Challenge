class Solution {
    public int minimumPushes(String word) {
        int length = 0;
        if(word.length() <= 8){
            return word.length();
        }else if(word.length() <= 16){
            length = word.length()-8;
            return 8 +(length*2);
        }else if(word.length() <= 24){
            length = word.length()-16;
            return 24 +(length*3);
        }else if(word.length() <= 26){
            length = word.length()-24;
            return 48 +(length*4);
        }
        return -1;
    }
}