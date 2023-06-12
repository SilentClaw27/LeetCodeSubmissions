class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] ans = {0,0};
        int sum = 0;
        int first = 0;
        int second = 0;
        boolean found = false;

        for(int i =0;i<length;i++){
            if(found){
                break;
            }
            for(int j=0;j<length;j++){
                
                if(i == j){
                    continue;
                }
                // System.out.println(nums[i] + ": "+ nums[j]);
                sum = nums[i] + nums[j];
                if(sum == target){
                    found = true;
                    first = i;
                    second = j;
                    break;
                }
            }
        }
        System.out.println(first);
        System.out.println(second);

        ans[0] = first;
        ans[1] = second;
        return ans;
    }
}