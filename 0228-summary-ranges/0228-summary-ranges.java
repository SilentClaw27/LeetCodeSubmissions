class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<String>();
        List<String> hold = new ArrayList<String>();
        String holdS = "";

        for(int i =0;i<nums.length;i++){
            if(i != nums.length-1){
                if(nums[i+1] == nums[i] + 1){
                    hold.add(String.valueOf(nums[i]));
                }
                else{
                    hold.add(String.valueOf(nums[i]));
                    if(hold.size() == 1){
                        holdS = String.valueOf(hold.get(0));
                    }
                    else{
                        holdS = hold.get(0) + "->" + hold.get(hold.size()-1);
                    }
                    ans.add(holdS);
                    hold.clear();
                    holdS = "";
                }
            }
            else{
                    hold.add(String.valueOf(nums[i]));
                    if(hold.size() == 1){
                        holdS = String.valueOf(hold.get(0));
                    }
                    else{
                        holdS = hold.get(0) + "->" + hold.get(hold.size()-1);
                    }
                    hold.clear();
                    ans.add(holdS);
                    holdS = "";
            }
        }


        return ans;
    }
}