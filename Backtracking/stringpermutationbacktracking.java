//leet code syntaxx//


class Solution {
    
    public void helper(int[] nums, List<Integer> ds, boolean[] isvalid, List<List<Integer>> ans) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds)); 
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (!isvalid[i]) { 
                ds.add(nums[i]);
                isvalid[i] = true; 
                helper(nums, ds, isvalid, ans);
                isvalid[i] = false; 
                ds.remove(ds.size() - 1); 
            }
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] isvalid = new boolean[nums.length]; 
        helper(nums, ds, isvalid, ans);
        return ans;
    }
}