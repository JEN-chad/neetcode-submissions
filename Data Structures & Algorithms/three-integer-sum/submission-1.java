class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> pairs = new HashSet<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                
                // while(left == right){
                //     left ++;
                // }
                 

                if(nums[i] + nums[left] + nums[right] == 0){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);

                    pairs.add(triplet);
                }
                if(nums[i] + nums[left] + nums[right] < 0){
                    left ++;
                }else{
                    right --;
                }
            }
        }
        List<List<Integer>> res = new ArrayList<>(pairs);
        return res;
    }
}
