class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] res = {-1, -1};
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){

            while(nums[left] == nums[right]){
                left ++;
            }

            if(nums[left] + nums[right] == target){
                res[0] = left + 1;
                res[1] = right + 1;
                return res;
            }
            
            if(nums[left] + nums[right] < target){
            left ++;
            }
            else{
            right --;
            }

        }
        return res;
    }
}
