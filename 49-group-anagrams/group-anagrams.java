class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>>hm=new HashMap<>();
       for(String s:strs){
            int arr[]=new int[26];
            for(char ch:s.toCharArray()){
                arr[ch-'a']++;
            }
            String ans=Arrays.toString(arr);
            if(!hm.containsKey(ans)){
                hm.put(ans,new ArrayList<>());
            }
            hm.get(ans).add(s);
       } 
       return new ArrayList<>(hm.values());
    }
}