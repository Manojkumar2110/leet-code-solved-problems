class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] str=text.split(" ");
        int count=0;
        int ans=0;
        ArrayList<Character>al=new ArrayList<>();
        for(int i=0;i<brokenLetters.length();i++){
            al.add(brokenLetters.charAt(i));
        }
        for(int i=0;i<str.length;i++){
            count=0;
            char[] ch=str[i].toCharArray();
            for(int j=0;j<ch.length;j++){
                if(al.contains(ch[j])){
                    count++;
                }
            }System.out.print(count);
            if(count==0){
                ans++;
            }
        }
        return ans;
    }
}