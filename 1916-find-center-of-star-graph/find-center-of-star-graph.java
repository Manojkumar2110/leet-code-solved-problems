class Solution {
    public int findCenter(int[][] edges) {
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<edges.length;i++){
            for(int j=0;j<edges[0].length;j++){
                al.add(edges[i][j]);
            }
        }
        System.out.print(al);
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<al.size();i++){
            if(!hm.containsKey(al.get(i))){
                hm.put(al.get(i),1);
            }
            else{
                hm.put(al.get(i),hm.get(al.get(i))+1);
            }
        }
        int max=Integer.MIN_VALUE;
        for(int a:hm.keySet()){
            if(hm.get(a)>max){
                max=hm.get(a);
            }
        }
        int ans=0;
        for(int a:hm.keySet()){
            if(hm.get(a)==max){
                ans=a;
                break;
            }
        }
        return ans;
    }
}