class Solution {
    public int splitNum(int num) {
        String str=Integer.toString(num);
        char[] ch=str.toCharArray();
        String s1="";
        String s2="";
        Arrays.sort(ch);
        for(int i=0;i<ch.length;i++){
            if(i%2==0){
                s1=s1+ch[i];
            }
            else{
                s2=s2+ch[i];
            }
        }
        int ans=Integer.parseInt(s1)+Integer.parseInt(s2);
        return ans;
    }
}