class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer>al=new ArrayList<>();
        String s=Character.toString(x);
        for(int i=0;i<words.length;i++){
            if(words[i].contains(s)){
                al.add(i);
            }
        }
        return al;
    }
}