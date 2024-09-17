class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer>hm=new HashMap<>();
        String[] str1=s1.split(" ");
        for(int i=0;i<str1.length;i++){
            if(!hm.containsKey(str1[i])){
                hm.put(str1[i],1);
            }else{
                hm.put(str1[i],hm.get(str1[i])+1);
            }
        }
        String[] str2=s2.split(" ");
        for(int i=0;i<str2.length;i++){
            if(!hm.containsKey(str2[i])){
                hm.put(str2[i],1);
            }else{
                hm.put(str2[i],hm.get(str2[i])+1);
            }
        }
        ArrayList<String>al=new ArrayList<>();
        for(String ans:hm.keySet()){
            if(hm.get(ans)==1){
                al.add(ans);
            }
        }
        String[] str3=new String[al.size()];
        for(int i=0;i<al.size();i++){
            str3[i]=al.get(i);
        }
        return str3;
    }
}