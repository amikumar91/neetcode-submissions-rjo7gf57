class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int max = 1;
        int count = 1;
        int lastUnique = nums[0];
        for(int i = 1 ; i < nums.length; i++){
            if(nums[i] == lastUnique){
                continue;
            }
            if(nums[i] != lastUnique + 1){
                max = Math.max(max , count);
                count = 0;
            }
            lastUnique = nums[i];
            count++;
        }

        return Math.max(max , count);
    }
}
