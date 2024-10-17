class Solution {
    public int secondHighest(String s) {
        TreeSet<Integer>ts=new TreeSet<>();
        for(int i=0;i<s.length();i++){
            int a=(int)s.charAt(i);
            if(a>=48&&a<=57){
                ts.add(Character.getNumericValue(s.charAt(i)));
            }
            else{
                continue;
            }
        }
        if(ts.size()<2){
            return -1;
        }
        ts.pollLast();
        return ts.last();
    }
}