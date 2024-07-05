class Solution {
    public String sortVowels(String s) {
        char[] vowels={'A','E','I','O','U','a','e','i','o','u'};
        StringBuilder sc=new StringBuilder(s);
        ArrayList<Character>ar=new ArrayList<>();
        for(char c:vowels){
            ar.add(c);
        }
        ArrayList<Character>ar1=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(ar.contains(c)){
            ar1.add(c);
            }
        }
        Collections.sort(ar1);
        int index=0;
        for(int i=0;i<sc.length();i++){
            if(ar.contains(sc.charAt(i))){
                sc.setCharAt(i,ar1.get(index++));
            }
        }
        return sc.toString();
    }
}