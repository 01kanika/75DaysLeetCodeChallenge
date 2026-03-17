class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int num : nums){
        map.put(num, map.getOrDefault(num, 0) + 1);

        }
        while(k > 0){
            k--;
            int key = 0;
            max = 0;
            for(int num: nums){
                if(map.containsKey(num)){
                    if(max < map.get(num)){
                        max = map.get(num);
                        key = num;
                    }
                }
            }
            ans[k] = key;
            map.remove(key);
        }
        return ans;
    }
}