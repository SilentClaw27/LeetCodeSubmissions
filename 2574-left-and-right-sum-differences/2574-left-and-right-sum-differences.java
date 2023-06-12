class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] answer = new int[nums.length];
        int leftSum = 0;
        int rightSum = 0;

        for(int i=0;i<nums.length;i++){
            leftSum = 0;
            rightSum = 0;

            if(i == 0){
                leftSum = 0;
            }
            else{
                for(int j = 0;j < i;j++){
                    leftSum = leftSum + nums[j];
                }
            }

            if(i == nums.length-1){
                rightSum = 0;
            }
            else{
                for(int k = i+1;k<nums.length;k++){
                    rightSum = rightSum + nums[k];
                }
            }

            answer[i] = Math.abs(leftSum - rightSum);
        }
        return answer;
    }
}