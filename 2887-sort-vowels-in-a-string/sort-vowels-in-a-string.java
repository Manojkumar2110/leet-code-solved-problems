class Solution {
    public String sortVowels(String s) {
        int n=s.length();
        char[] arr=new char[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                arr[k++]=s.charAt(i);
            }
        }
        char[] vowels = Arrays.copyOf(arr, k);
        Arrays.sort(vowels);
        StringBuilder sb=new StringBuilder(s);
        k=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                sb.setCharAt(i, vowels[k++]);
        }
        }
        return sb.toString();

    }
}