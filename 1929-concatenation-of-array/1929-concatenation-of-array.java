class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int m = nums.length;
        int n = nums.length*2;

        int[] ans = new int[n];

        for(int i=0 ; i<nums.length ;i++)
        {
            ans[i] = nums[i];
            ans[i+m] = nums[i];
        }

        return ans;
    }
}