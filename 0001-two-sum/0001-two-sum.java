class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] dup = new int[nums.length];
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            dup[i]=nums[i];
        }

        Arrays.sort(nums);

        int i=0;
        int j=nums.length-1;
        int val1 = 0;
        int val2 = 0;
        while(i<j){
            if(nums[i]+nums[j]>target){
                j--;
            }
            else if(nums[i]+nums[j]<target){
                i++;
            }
            else{
                val1 = nums[i];
                val2 = nums[j];
                break;
            }
        }
        j=0;
        int k=0;
        while(j<2){
            if(dup[k]==val1){
                ans[j++]=k++;
            }
            else if(dup[k]==val2){
                ans[j++]=k++;
            }
            else{
                k++;
            }
        }
        return ans;
        
    }
}