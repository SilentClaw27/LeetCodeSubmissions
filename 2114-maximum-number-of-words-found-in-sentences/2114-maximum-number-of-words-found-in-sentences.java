class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int length = sentences.length;
        int chars = 0;
        int max = 0;
        int words = 0;

        for(int i=0;i<length;i++){
            words = 0;
            chars = sentences[i].length();
            for(int j=0;j<chars;j++){
                if(sentences[i].charAt(j) == 32|| j == chars-1){
                    words = words + 1;
                }
            }

            if(words > max){
                max = words;
            }
        }
        return max;
    }
}