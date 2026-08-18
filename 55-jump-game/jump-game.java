class Solution {
    public boolean canJump(int[] nums) {
        int lst = nums.length -1;
        for(int i = nums.length-2; i>=0;i--){
            if(i+nums[i] >= lst){
                lst =i;
            }
        }
        return lst ==0;
    }
}