class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] s_table = new int[26];
        int[] t_table = new int[26];

        for(int i = 0 ; i < s.length(); i++){
            int index = (int) s.charAt(i) - 97;
            s_table[index] += 1; 
        }

        for(int i = 0 ; i < t.length(); i++){
            int index = (int) t.charAt(i) - 97;
            t_table[index] += 1; 
        }

        for(int i=0 ; i < 26 ; i++){
            if(s_table[i] != t_table[i]){
                return false;
            }
        }

        return true;
    }
}
