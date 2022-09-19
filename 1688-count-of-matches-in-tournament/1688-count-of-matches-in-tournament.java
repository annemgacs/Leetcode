class Solution {
    public int numberOfMatches(int n) {
        int total=0;
        while(n>1)
        {
            int x=n;
            n=n/2;
            total=total+x-n;
        }
        return total;
        
    }
}