class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder(strs[0]);
        for(int i = 1 ; i < strs.length ; i++){
            String cmp2 = strs[i];
            for(int j = 0 ; j < Math.min(cmp2.length() , prefix.length()); j++){
                    if(prefix.charAt(j) == cmp2.charAt(j)){
                        continue;
                    }else{
                        prefix.delete(j , prefix.length());
                        break;
                    }
            }

            if(prefix.length() > cmp2.length()){
                prefix.delete(cmp2.length() , prefix.length());
            }

        }
        if(prefix.length() == 0){
            return "";
        }else{
            return prefix.toString();
        }
    }
}