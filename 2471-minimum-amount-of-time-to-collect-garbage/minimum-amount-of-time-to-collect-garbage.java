class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int m=0,p=0,g=0,pm=0,pp=0,pg=0;
        for(int i=0;i<garbage.length;i++){
            String str=garbage[i];
            for(char ch:str.toCharArray()){
                if(ch=='G'){
                    g++;
                    pg=i;
                }
                if(ch=='P'){
                    p++;
                    pp=i;
                }
                if(ch=='M'){
                    m++;
                    pm=i;
                }   
            }
        }
        int psum=0,gsum=0,msum=0;
        for(int i=0;i<pm;i++){
            msum+=travel[i];
        }
         for(int i=0;i<pp;i++){
            psum+=travel[i];
        }
         for(int i=0;i<pg;i++){
            gsum+=travel[i];
        }
        return psum+gsum+msum+m+p+g;
    }
}