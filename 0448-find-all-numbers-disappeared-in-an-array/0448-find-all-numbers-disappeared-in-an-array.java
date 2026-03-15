class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        Arrays.sort(nums);
        int[] f = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            f[nums[i]]++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i < f.length; i++) {
            if (f[i] == 0) {
                ans.add(i);
            }
        }

        return ans;
    }
}