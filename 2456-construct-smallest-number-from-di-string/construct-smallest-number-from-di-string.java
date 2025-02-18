class Solution {
    public String smallestNumber(String pattern) {
        int n=pattern.length()+1;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<pattern.length();i++){
            int temp=i;
            while(temp<pattern.length()&&pattern.charAt(temp)=='D'){
                temp++;
            }
            swap(arr,i,temp);
            if(temp!=i){
                i=temp-1;
            }
        }
        for(int a:arr){
            sb.append(a);
        }
        return sb.toString();
    }
    private void swap(int arr[],int st,int end){
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }
}