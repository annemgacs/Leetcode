class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> L=new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i+=2)
        {
            for(int j=0;j<nums[i];j++)
            {
                L.add(nums[i+1]);
            }
            
        }
        
        int[] ans=new int[L.size()];
        for(int i=0;i<L.size();i++)
        {
            ans[i]=L.get(i);
        }
        
        return ans;
        
        
    }
}