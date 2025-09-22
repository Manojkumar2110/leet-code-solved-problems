class Solution {
        public int maxFrequencyElements(int[] nums) {
                HashMap<Integer,Integer>hm=new HashMap<>();
                        for(int i=0;i<nums.length;i++){
                                    if(!hm.containsKey(nums[i])){
                                                    hm.put(nums[i],1);
                                                                }else{
                                                                                hm.put(nums[i],hm.get(nums[i])+1);
                                                                                            }
                                                                                                    }
                                                                                                            int count=0;
                                                                                                                    int max=0;
                                                                                                                            for(int value : hm.values()){
                                                                                                                                         max = Math.max(max,value);
                                                                                                                                                  }
                                                                                                                                                          for(int k:hm.values()){
                                                                                                                                                                      if(k>=max && k>1){
                                                                                                                                                                                      count+=k;
                                                                                                                                                                                                  }
                                                                                                                                                                                                          }
                                                                                                                                                                                                                  if(count>1){
                                                                                                                                                                                                                              return count;
                                                                                                                                                                                                                                      }else{
                                                                                                                                                                                                                                                  return nums.length;
                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                              }
