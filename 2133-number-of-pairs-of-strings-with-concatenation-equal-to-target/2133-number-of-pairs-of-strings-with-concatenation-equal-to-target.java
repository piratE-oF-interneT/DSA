class Solution {
    public int numOfPairs(String[] nums, String target) {

        int count=0;

        for(int i=0;i<nums.length;i++){

            for(int j=i+1;j<nums.length;j++){
                if(nums[i].concat(nums[j]).equals(target)){
                    count++;
                }
                if(nums[j].concat(nums[i]).equals(target)){
                    count++;
                }
            }
        }
        
        return count;
        
    }
}