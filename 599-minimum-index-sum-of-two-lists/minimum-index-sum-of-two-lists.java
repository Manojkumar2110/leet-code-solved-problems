class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> al = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                int sum=i+j;

                

                if (list1[i].equals(list2[j])) {
                    if(sum<min){
                    al.clear();
                    al.add(list1[i]);
                    min=sum;
                    }
                    else if(sum==min){
                        al.add(list1[i]);
                     }
                    }

                    
                }


     

            }
        
        String[] ans = new String[al.size()];
        int k = 0;
        for(String st : al) {
            ans[k++] = st;
        }
        return ans;

    }
}