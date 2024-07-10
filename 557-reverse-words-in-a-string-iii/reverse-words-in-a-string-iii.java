class Solution {
    public String reverseWords(String s) {
        StringBuilder db=new StringBuilder();
        String a[]=s.split(" ");
        for(int i=0;i<a.length;i++){
            StringBuilder x=new StringBuilder(a[i]);
            db.append(x.reverse().toString());
            if(i==a.length-1){
                break;
            }
            else{
                db.append(" ");
            }
        }
        return db.toString();
    }
}