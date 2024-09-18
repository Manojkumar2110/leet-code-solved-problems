/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    var count=0;
    for(var i=0;i<nums.length;i++){
        count^=nums[i];
    }
    return count;
};