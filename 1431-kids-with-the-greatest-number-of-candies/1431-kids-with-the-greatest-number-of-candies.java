class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> Ans=new ArrayList<Boolean>();
        int max=candies[0];
        
        for(int i=1;i<candies.length;i++)
        {
            if(candies[i]>max)
            {
                max=candies[i];
            }
        }
        
        for(int i=0; i<candies.length;i++)
        {
            
            
            if(candies[i]+extraCandies>=max)
            {
                Ans.add(true);
            }
            else
            {
                Ans.add(false);
            }
            
        }
        return Ans;
        
    }
}