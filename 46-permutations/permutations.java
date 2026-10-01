class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(nums, new ArrayList<>(), res);
        return res;
    }

    void solve(int[] nums, List<Integer> temp, List<List<Integer>> res){
        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(temp.contains(nums[i])){
                continue;
            }

            temp.add(nums[i]);
            solve(nums, temp, res);
            temp.remove(temp.size() - 1);
        }
    }
}