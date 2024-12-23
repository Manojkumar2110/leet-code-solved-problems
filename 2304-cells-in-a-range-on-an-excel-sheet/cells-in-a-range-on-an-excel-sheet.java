class Solution {
    public List<String> cellsInRange(String s) {
        char a=s.charAt(0);
        char b=s.charAt(1);
        char c=s.charAt(3);
        char d=s.charAt(4);
        ArrayList<String>al=new ArrayList<>();
        for(char i=a;i<=c;++i){
            for(char j=b;j<=d;++j){
                al.add(""+i+j);
            }
        }
        return al;
    }
}