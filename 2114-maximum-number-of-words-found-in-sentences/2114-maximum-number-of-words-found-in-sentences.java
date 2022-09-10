class Solution {
    public int mostWordsFound(String[] sentences) {
        int sum[]= new int[sentences.length];
        int max=0;
        for(int i=0; i < sentences.length; i++)
        {
            sum[i]=1;
            for(int j=0;j< sentences[i].length(); j++)
            {
            if(sentences[i].charAt(j) == ' ')
            {
                sum[i]=sum[i]+1;
            }
            }
            if(sum[i]>max)
            {
                max=sum[i];
            }
        }
        return max;
        
    }
}