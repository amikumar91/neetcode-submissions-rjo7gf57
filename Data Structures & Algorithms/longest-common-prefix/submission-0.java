class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        int size  = Integer.MAX_VALUE;

        for(int i = 0 ; i < strs.length ;i++){
            if(strs[i].length() < size){
                prefix = strs[i];
                size = prefix.length();
            }
        }

        for(String s : strs){
            while(!s.startsWith(prefix)){
                prefix = prefix.substring(0 , prefix.length() -1);
                if(prefix.length() == 0) return "";
            }
        }

        return prefix;
    }
}