class Solution {
    public int similarPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(check(words[i],words[j])){
                    count++;
                }
            }
        }
        return count;
    }
    static boolean check(String s1, String s2){
        HashSet<Character>hs1=new HashSet<>();
        for(int i=0;i<s1.length();i++){
            hs1.add(s1.charAt(i));
        }
         HashSet<Character>hs2=new HashSet<>();
        for(int i=0;i<s2.length();i++){
            hs2.add(s2.charAt(i));
        }
        return hs1.equals(hs2);
    }
}