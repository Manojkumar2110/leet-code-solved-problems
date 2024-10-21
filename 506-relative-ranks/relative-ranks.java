class Solution {
    public String[] findRelativeRanks(int[] score) {
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<score.length;i++){
            al.add(score[i]);
        }
        Collections.sort(al,Collections.reverseOrder());
        System.out.print(al);
        HashMap<Integer,String>hm=new HashMap<>();
        int k=1;
        for(int i=0;i<al.size();i++){
            String st=Integer.toString(k++);
            if(st.equals("1")){
                hm.put(al.get(i),"Gold Medal");
            }
            else if(st.equals("2")){
                 hm.put(al.get(i),"Silver Medal");
            }
            else if(st.equals("3")){
                 hm.put(al.get(i),"Bronze Medal");
            }else{
                hm.put(al.get(i),st);
            }
            
        }
        String ans[]=new String[score.length];
        for(int i=0;i<score.length;i++){
            ans[i]=hm.get(score[i]);
        }
        return ans;
    }
}