class Solution {
    public int maxArea(int[] heights) {
        int max = 0;

        int i = 0;
        int j = heights.length - 1;

        while(i < j){
            int vol = Math.min(heights[i] , heights[j]) * (j - i); 
            
            max = Math.max(max , vol);

            if(heights[i] > heights[j]){
                j--;
            }else if(heights[i] < heights[j]){
                i++;
            }else{
                i++;
            }
        }

        return max;
    }
}
