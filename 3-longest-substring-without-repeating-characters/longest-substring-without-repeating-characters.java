class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map  = new HashMap<>();
        int l =0, maxlen=0 , r=0;

        while( r < s.length()){
            char ch = s.charAt(r);
            if(map.containsKey(ch) && map.get(ch) >= l){
                 l = map.get(ch)+1;
            }
            else {
                 map.put(ch,r);
                maxlen = Math.max(maxlen , r-l+1);
                r++;
            }
           
        }   
        return maxlen;
    }
}