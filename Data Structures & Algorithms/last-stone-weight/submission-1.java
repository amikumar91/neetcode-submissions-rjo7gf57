class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 0){
            return 0;
        }else if(stones.length == 1){
            return stones[0];
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a , b) -> b - a);

        for(int stone : stones){
            pq.add(stone);
        }

        while(pq.size() > 1){
            int one = pq.poll();
            int two = pq.poll();
            System.out.println(one + " " + two);
            if(one == two){
                continue;
            }else{
                pq.add(Math.max(one , two) - Math.min(one , two));
            }
        }

        return pq.isEmpty() ? 0 : pq.poll();
    }
}
