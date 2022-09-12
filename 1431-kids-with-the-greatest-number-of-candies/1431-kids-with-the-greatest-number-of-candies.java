class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> Ans=new ArrayList<Boolean>();
        /*int[] extra=new int[candies.length];
        int[] duplicate= new int[candies.length];
        duplicate=candies;
        Arrays.sort(duplicate);
        
        for(int i=0; i<candies.length;i++)
        {
            extra[i]=candies[i+3];
            if(extra[i]<duplicate[candies.length-1])
            {
                Ans.add("false");
            }
            else
            {
                Ans.add("true");
            }
            
        }*/
        int max=-1;
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>=max)
            {
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies >= max)
                Ans.add(true);
            else
                Ans.add(false);
        }
        return Ans;
        
    }
}