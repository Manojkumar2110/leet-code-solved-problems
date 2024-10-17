class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),1);
            }
            else{
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
        }
        List<Map.Entry<Character,Integer>>al=new ArrayList<>(hm.entrySet());
        al.sort((a,b)->b.getValue()-a.getValue());
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer> entry:al){
            for(int i=0;i<entry.getValue();i++){
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}