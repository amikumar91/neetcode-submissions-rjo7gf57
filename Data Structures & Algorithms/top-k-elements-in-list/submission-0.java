class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        Map<Integer , Integer> fmap = new HashMap<>();
        for(int num : nums){
            fmap.put(num , fmap.getOrDefault(num , 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer , Integer>> pq = new PriorityQueue(Map.Entry.comparingByValue());

        for(Map.Entry<Integer , Integer> entry : fmap.entrySet()){
            pq.add(entry);
            if(pq.size() > k){
                pq.poll();
            }
        }

        for(int i = 0 ; i < k ; i++){
            ans[i] = pq.poll().getKey();
        }

        return ans;

    }
}
