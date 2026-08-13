class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int count = 0;
        
        for(int i = 0; i < s.length() ; i++){
            count = 0;
            int j = i;
            while(j < s.length() && set.add(s.charAt(j))){
                count++;
                j++;
            }

            max = Math.max(count , max);
            set = new HashSet<>();
        }

        return max;
    }
}
