class Solution {
    public int maxFreqSum(String s) {
        TreeMap<Character, Integer> hm = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), 1);
            } else {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            }
        }
       int con=0,vov=0;
       for(char c:hm.keySet()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
               if(hm.get(c)>vov){
                vov=hm.get(c);
               } 

            }
            else{
                if(hm.get(c)>con){
                    con=hm.get(c);
                }
            }
       }
       return vov+con;
    }
}