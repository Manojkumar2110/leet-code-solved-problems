class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<accounts.length;i++){
            sum=0;
            for(int j=0;j<accounts[0].length;j++){
                sum+=accounts[i][j];
            }
            al.add(sum);
        }
        Collections.sort(al);
        return al.get(al.size()-1);
    }
}