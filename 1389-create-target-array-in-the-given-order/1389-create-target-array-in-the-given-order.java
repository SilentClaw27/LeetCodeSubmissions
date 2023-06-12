class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];

        for(int i =0;i<target.length;i++){
            target[i] = -1;
        }

        for(int i = 0;i < nums.length;i++){
            
            if(target[index[i]] == -1){
                target[index[i]] = nums[i];
            }
            else{
                for(int j=nums.length-1;j>index[i];j--){
                    target[j] = target[j-1];

                    if(j-1 == index[i]){
                        target[j-1] = nums[i];
                    }
                }

            }

        }
        return target;
    }
}