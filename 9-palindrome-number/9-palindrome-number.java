class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        List<Integer> l= new ArrayList<Integer>();
        if(x<0)
        {
            return false;
        }
        while(x>0)
        {
            l.add(x%10);
            x=x/10;
        }
        for(int i=0;i<l.size()/2;i++)
        {
            if(l.get(i)!=l.get(l.size()-1-i))
            {
                return false;
            }
            
        }
        return true;
        
    }
}