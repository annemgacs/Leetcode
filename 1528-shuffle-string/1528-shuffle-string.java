class Solution {
    public String restoreString(String s, int[] indices) {
        
        StringBuffer stringBuffer = new StringBuffer(s);
        for(int i=0; i<s.length();i++)
        {
            stringBuffer.setCharAt(indices[i],s.charAt(i));
            
        }
        return stringBuffer.toString();
        
        
    }
}