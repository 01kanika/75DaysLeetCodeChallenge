class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, l = 0, r = height.length - 1;
        while(l < r){
            min = Math.min(height[l], height[r]);
            max = Math.max(max, min * (r - l));
            if(height[r] > height[l]) l++;
            else r--;
        }
        return max;
    }
}