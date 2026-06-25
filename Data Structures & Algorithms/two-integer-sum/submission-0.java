class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> add = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];

            if(add.containsKey(complement)){
                return new int[]{add.get(complement),i};
            }
            add.put(nums[i],i);
        }
        return new int[] {};
    }

}
