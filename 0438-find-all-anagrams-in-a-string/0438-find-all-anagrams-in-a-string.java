class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList();

        int arr[] = new int[256];
        int curr[] = new int[256];

        int low = 0;

        for(char ch : p.toCharArray()){
            arr[ch]++;
        }

        for(int high = 0 ; high < s.length() ; high++){
            curr[s.charAt(high)]++;
            if(isContain(curr, arr)){
                list.add(low);
                curr[s.charAt(low)]--;
                low++;
            }else if(high-low+1 == p.length()){
            curr[s.charAt(low)]--;
            low++;
            }
        }
        return list;
    }

    public boolean isContain(int arr[] , int p[]){
        for(int i = 0 ; i < 256 ; i++){
            if(arr[i] != p[i]){
                return false;
            }
        }
        return true;
    }
}