class Solution {
    public int getLucky(String s, int k) {
        int arr[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=(int)(s.charAt(i)-97+1);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        String str=sb.toString();
        while(k!=0){
            int sum=0;
            for(char ch:str.toCharArray()){
                sum+=ch-'0';
            }
            str=Integer.toString(sum);
            k--;
        }
        return Integer.parseInt(str);
    }
}