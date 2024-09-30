class Solution {
    public int countWords(String[] words1, String[] words2) {
       HashMap<String,Integer>hm=new HashMap<>();
       for(int i=0;i<words1.length;i++){
            if(!hm.containsKey(words1[i])){
                hm.put(words1[i],1);
            }
            else{
                hm.put(words1[i],hm.get(words1[i])+1);
            }
       } 
       HashMap<String,Integer>hm1=new HashMap<>();
       for(int i=0;i<words2.length;i++){
            if(!hm1.containsKey(words2[i])){
                hm1.put(words2[i],1);
            }
            else{
                hm1.put(words2[i],hm1.get(words2[i])-1);
            }
       }
       int count=0;
       for(int i=0;i<words1.length;i++){
        for(int j=0;j<words2.length;j++){
            if(words1[i].equals(words2[j])){
                if(hm.get(words1[i])==1&&hm1.get(words2[j])==1){
                    count++;
                }
            }
        }
       }
       return count;
    }
}