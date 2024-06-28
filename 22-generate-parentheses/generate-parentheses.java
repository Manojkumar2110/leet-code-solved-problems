class Solution {
    public List<String> generateParenthesis(int n) {
       ArrayList<String>ar=new ArrayList<>();
       func(ar,"",0,0,n);
       return ar; 
    }
    public void func(ArrayList<String>ar,String s,int open,int close,int max){
        if(s.length()==max*2){
            ar.add(s);
            return;
        }
        if(open<max){
            func(ar,s+'(',open+1,close,max);
        }
        if(close<open){
            func(ar,s+')',open,close+1,max);
        }
    }
}