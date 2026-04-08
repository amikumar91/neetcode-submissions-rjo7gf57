class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();

        for(int i = 0 ; i < strs.length; i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            map.computeIfAbsent(sorted , k -> new ArrayList<String>()).add(strs[i]);
        }

        List<List<String>> ans = new ArrayList<>();
        for(String key : map.keySet()){
            ans.add(map.get(key));
        }

        return ans;
    }
}
