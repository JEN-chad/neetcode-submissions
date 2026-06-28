class Solution {

   public int maxLeft(int k, int[] nums){
       int maxLeft = Integer.MIN_VALUE;

       for(int i = 0; i <= k; i++ ){
         maxLeft = Math.max(nums[i], maxLeft);
       }

       return maxLeft;
   }

   public int maxRight(int k, int[] nums){
       int maxRight = Integer.MIN_VALUE;

       for(int i = k; i < nums.length; i++ ){
         maxRight = Math.max(nums[i], maxRight);
       }

       return maxRight;
   }


    public int trap(int[] height) {
        int maxWaterUnit = 0;

        for(int i = 0; i < height.length; i++){

            if(i == 0 && height[i] == 0){
                continue;
            }
            
            int area = Math.min(maxLeft(i, height), maxRight(i, height)) - height[i];

            maxWaterUnit += area;
        }

        return maxWaterUnit;

    }
}
