class Solution {
    public int longestConsecutive(int[] nums) {
        SortedSet<Integer> set = new TreeSet<>();
        for(int n: nums){
            set.add(n);
        }
        int[] arr = new int[set.size()];
        int i = 0;
        for(int num: set){
            arr[i] = num;
            i++;
        }
        int l = 0, r = 0, maxlen = 0;
        while(r < arr.length){
            if(arr[r] - arr[l] != (r - l)) l = r;
            if(arr[r] - arr[l] == (r - l)) maxlen = Math.max(maxlen, r - l + 1);

            r++;
            
        }

        return maxlen;
    }
}