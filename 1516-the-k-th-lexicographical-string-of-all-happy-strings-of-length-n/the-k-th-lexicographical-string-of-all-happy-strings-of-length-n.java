class Solution {
    public String getHappyString(int n, int k) {
        ArrayList<String>al=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        comb(al,sb,n);
        Collections.sort(al);
        return (k>al.size())? "" : al.get(k-1);
    }
    private static void comb(ArrayList<String>al,StringBuilder sb,int n){
        if(sb.length()==n){
            al.add(sb.toString());
            return;
        }
        
        for(char ch:new char[]{'a','b','c'}){
            if(sb.isEmpty()||sb.charAt(sb.length()-1)!=ch){
                comb(al,new StringBuilder(sb).append(ch),n);
            }
        }
    }
}