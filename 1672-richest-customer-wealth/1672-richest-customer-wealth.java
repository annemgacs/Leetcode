class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] sum=new int[accounts.length];
        int max=-9999;
        for(int i=0; i<accounts.length;i++)
        {
            sum[i]=0;
            for (int j=0;j< accounts[i].length;j++)
            {
                sum[i]=sum[i]+accounts[i][j];
            }
            if(sum[i]>max)
            {
                max=sum[i];
            }
            
        }
        return max;
        
    }
}