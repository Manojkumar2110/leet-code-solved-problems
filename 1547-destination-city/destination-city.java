class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String>hs=new HashSet<>();
        for(List<String> s:paths){
            hs.add(s.get(0));
        }
        for(List<String>a:paths){
            if(!hs.contains(a.get(1))){
                return a.get(1);
            }
        }
        return "";
    }
}