class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0, r = 0;
        long max = 0, sum = 0;
        for(r = 0; r < k; r++){
            sum += nums[r];
        }
        max = sum;
        while(r < nums.length){
            sum -= nums[l];
            l++;
            sum += nums[r];
            r++;
            max = Math.max(sum, max);
        }
        return (double) max/k;
    }
}