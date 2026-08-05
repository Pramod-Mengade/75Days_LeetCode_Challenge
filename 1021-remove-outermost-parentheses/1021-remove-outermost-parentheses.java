class Solution {
    public String removeOuterParentheses(String s) {
        int depth = 0;
        StringBuilder str = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(depth > 0){
                    str.append(ch);
                }
                depth++;
            }else if(ch == ')'){
                depth--;

                if(depth > 0){
                    str.append(ch);
                }
            }
        }
        return str.toString();
    }
}