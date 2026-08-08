class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

    HashMap <Character , Integer> map1 = new HashMap<>();
    HashMap <Character , Integer> map2 = new HashMap<>();

    int count1 = 0 ;
    int count2 = 0 ;

    for(int i = 0 ; i < s.length() ; i++){
        char ch1 = s.charAt(i);
        char ch2 = t.charAt(i);

        if(!map1.containsKey(ch1)){
            map1.put(ch1,count1);
            count1++;
        }

        if(!map2.containsKey(ch2)){
            map2.put(ch2,count2);
            count2++;
        }

        if(!map1.get(ch1).equals(map2.get(ch2))){
            return false;
        }
    }

    return true;
    }
}