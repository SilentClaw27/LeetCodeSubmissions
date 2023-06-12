class Solution {
    public int[] decode(int[] encoded, int first) {
        int size = encoded.length+1;
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            if(i < size-1){
                arr[i] = first;
                first = first^encoded[i];
            }
            else{
                arr[i] = first;
            }
        }
        return arr;
    }
}