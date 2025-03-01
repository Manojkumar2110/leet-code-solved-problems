class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        HashMap<String,String>hm=new HashMap<>();
        hm.put("a1","b");
        hm.put("a2","w");
        hm.put("a3","b");
        hm.put("a4","w");
        hm.put("a5","b");
        hm.put("a6","w");
        hm.put("a7","b");
        hm.put("a8","w");
        hm.put("b1","w");
        hm.put("b2","b");
        hm.put("b3","w");
        hm.put("b4","b");
        hm.put("b5","w");
        hm.put("b6","b");
        hm.put("b7","w");
        hm.put("b8","b");
        hm.put("c1","b");
        hm.put("c2","w");
        hm.put("c3","b");
        hm.put("c4","w");
        hm.put("c5","b");
        hm.put("c6","w");
        hm.put("c7","b");
        hm.put("c8","w");
        hm.put("d1","w");
        hm.put("d2","b");
        hm.put("d3","w");
        hm.put("d4","b");
        hm.put("d5","w");
        hm.put("d6","b");
        hm.put("d7","w");
        hm.put("d8","b");
        hm.put("e1","b");
        hm.put("e2","w");
        hm.put("e3","b");
        hm.put("e4","w");
        hm.put("e5","b");
        hm.put("e6","w");
        hm.put("e7","b");
        hm.put("e8","w");
        hm.put("f1","w");
        hm.put("f2","b");
        hm.put("f3","w");
        hm.put("f4","b");
        hm.put("f5","w");
        hm.put("f6","b");
        hm.put("f7","w");
        hm.put("f8","b");
        hm.put("g1","b");
        hm.put("g2","w");
        hm.put("g3","b");
        hm.put("g4","w");
        hm.put("g5","b");
        hm.put("g6","w");
        hm.put("g7","b");
        hm.put("g8","w");
        hm.put("h1","w");
        hm.put("h2","b");
        hm.put("h3","w");
        hm.put("h4","b");
        hm.put("h5","w");
        hm.put("h6","b");
        hm.put("h7","w");
        hm.put("h8","b");
        for(String h:hm.keySet()){
            if(hm.get(coordinate1).equals(hm.get(coordinate2))){
                return true;
            }
        }
        return false;
    }
}