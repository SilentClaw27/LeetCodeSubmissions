class Solution {
    public List<List<Integer>> generate(int numRows) {
        //if 1 = 1
        //if 2 [1,1]
        //if larger:
        //if first = first of above
        //if last = last of above
        //else current = current-1 + current of above
        int value = 0;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        List<Integer> hold1 = new ArrayList<Integer>();
        hold1.add(1);
        ans.add(hold1);
        
        if(numRows > 1){
            List<Integer> hold2 = new ArrayList<Integer>();
            hold2.add(1);
            hold2.add(1);
            ans.add(hold2);

            for(int i=2;i<numRows;i++){
                List<Integer> holdTemp = new ArrayList<Integer>();

                holdTemp.add(1);

                for(int j=1;j<i;j++){
                    value = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                    holdTemp.add(value);
                }

                holdTemp.add(1);
                ans.add(holdTemp);
            }
        }
        
        return ans;
    }
}