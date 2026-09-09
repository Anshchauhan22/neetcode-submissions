class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        boolean isdublicate = false;

        HashSet<Integer>set = new HashSet<>();
        for(int i = 0; i<nums.length;i++){
            if(set.contains(nums[i])){
               isdublicate = true;
            
                break;
            } else {
                set.add(nums[i]);
                
            }
        } return isdublicate;
    }
}