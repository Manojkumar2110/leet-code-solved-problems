class Solution {
    static final String[] keypad={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<>();
        }
        return ped("",digits);
    }
    static List<String> ped(String p,String up){
        if(up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int dig=up.charAt(0)-48;
        ArrayList<String>list=new ArrayList<>();
        String letters=keypad[dig];
        for(char ch:letters.toCharArray()){
            list.addAll(ped(p+ch,up.substring(1)));
        }
        return list;
    }
}