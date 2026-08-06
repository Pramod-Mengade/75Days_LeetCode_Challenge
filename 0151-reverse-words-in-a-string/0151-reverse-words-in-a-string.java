class Solution {
    public String reverseWords(String s) {
        String str = s.trim();
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

    for( int i = str.length()-1 ; i >= 0 ; i--){
        if(str.charAt(i) == ' '){
            if(str1.length() != 0){
            str1.reverse();
            str2.append(str1+" ");
            str1 = new StringBuilder();
            }
        }else{
            str1.append(str.charAt(i));
        }
    }
    str1.reverse();
    str2.append(str1);
    return str2.toString();
    }
}