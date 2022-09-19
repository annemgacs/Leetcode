class Solution {
    public int numberOfMatches(int n) {
        int total=0;
        while(n>1)
        {
            total=total+n-n/2;
            n=n/2;
            
        }
        return total;
        
    }
}