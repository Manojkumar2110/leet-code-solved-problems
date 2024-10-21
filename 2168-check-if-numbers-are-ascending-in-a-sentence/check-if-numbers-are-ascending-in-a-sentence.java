class Solution {
    public boolean areNumbersAscending(String s) {
        String[] st=s.split(" ");
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<st.length;i++){
            if(isnum(st[i])){
                al.add(Integer.parseInt(st[i]));
            }
        }
        for(int i=0;i<al.size()-1;i++){
            if(!(al.get(i)<al.get(i+1))){
                return false;
            }
        }
        return true;
    }
    static boolean isnum(String s){
        for(int i=0;i<s.length();i++){
            if(!(s.charAt(i)>='0'&&s.charAt(i)<='9')){
                return false;
            }
        }
        return true;
    }
}