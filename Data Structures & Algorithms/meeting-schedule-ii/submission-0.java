/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if (intervals.size() < 2) return intervals.size();

        intervals.sort(Comparator.comparingInt(i -> i.start));
        PriorityQueue<Integer> pqe = new PriorityQueue<>();
        int count = 0;

        for(Interval i : intervals){
            while(!pqe.isEmpty() && i.start >= pqe.peek()){
                pqe.remove();
            }

            pqe.add(i.end);
            count = Math.max(pqe.size(), count);
        }
        
        return count;
    }
}
