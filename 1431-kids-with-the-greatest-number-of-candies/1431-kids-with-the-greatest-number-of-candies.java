class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> Ans=new ArrayList<Boolean>();
        
        int[] duplicate= new int[candies.length];
        duplicate= candies.clone();
        
        Arrays.sort(duplicate);
        System.out.println(candies[0]);
        for(int i=0; i<candies.length;i++)
        {
            
            
            if(candies[i]+extraCandies>=duplicate[candies.length-1])
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