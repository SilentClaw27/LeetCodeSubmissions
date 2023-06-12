class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int freq = 0;
        int[] ans = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            freq = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i] == nums[j] || nums[j] > nums[i] || i == j){
                    continue;
                }
                else{
                    freq = freq + 1;
                }
            }
            ans[i] = freq;
        }
        return ans;
    }
}