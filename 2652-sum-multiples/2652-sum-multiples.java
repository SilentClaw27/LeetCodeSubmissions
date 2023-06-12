class Solution {
    public int sumOfMultiples(int n) {
        int mult = 0;

        for(int i =1;i<=n;i++){

            if(i % 3 == 0){
                mult = mult + i;
                continue;
            }
            else if(i % 5 == 0){
                mult = mult + i;
                continue;
            }
            else if(i % 7 == 0){
                mult = mult + i;
                continue;
            }
            else{
                continue;
            }
        }
        return mult;
    }
}