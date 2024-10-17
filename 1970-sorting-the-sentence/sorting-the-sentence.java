class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        int arr[]=new int[str.length];
        for(int i=0;i<str.length;i++){
            arr[i]=Character.getNumericValue(str[i].charAt(str[i].length()-1));
        }
        Arrays.sort(arr);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            for(String st:str){
                int n=Character.getNumericValue(st.charAt(st.length()-1));
                if(arr[i]==n){
                    sb.append(st.substring(0,st.length()-1));
                    sb.append(" ");
                }
            }
        }
        return sb.toString().trim();
    }
}