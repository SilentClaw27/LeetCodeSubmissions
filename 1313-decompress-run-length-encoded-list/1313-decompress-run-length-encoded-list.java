class Solution {
    public int[] decompressRLElist(int[] nums) {
        int length = 0;
        int counter = 0;
        int index = 0;
        int limit = 0;

        for(int i=0;2*i<nums.length;i++){
            length = length+nums[2*i];
        }

        int[] ans = new int[length];

        for(int i=0;2*i<nums.length;i++){
            counter=nums[2*i];
            limit = index+counter;

            for(index=index;index<limit;index++){
                if(nums[2*i+1] == 15){
                    System.out.println(i);
                }
                ans[index] = nums[2*i+1]; 
            }
        }

        
        return ans;
    }
}