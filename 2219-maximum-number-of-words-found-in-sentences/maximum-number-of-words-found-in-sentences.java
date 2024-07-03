class Solution {
    public int mostWordsFound(String[] sentences) {
        int a=0;
        int b=0;
        for(int i=0;i<sentences.length;i++){
            String[] st=sentences[i].split(" ");
            a=st.length;
            
            if(b<a){
                b=a;
            }

        }
        return b;
    }
}