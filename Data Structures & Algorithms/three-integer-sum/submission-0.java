class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        

        Set<List<Integer>> pairs = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        pairs.add(triplet);
                    }
                }
            }
        } 
        List<List<Integer>> result = new ArrayList<>(pairs);
        return result;
    }
}
