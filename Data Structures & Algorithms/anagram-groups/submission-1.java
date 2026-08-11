class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] orignial = str.toCharArray();
            Arrays.sort(orignial);
            String sorted = new String(orignial);

            map.computeIfAbsent(sorted , k -> new ArrayList<String>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
