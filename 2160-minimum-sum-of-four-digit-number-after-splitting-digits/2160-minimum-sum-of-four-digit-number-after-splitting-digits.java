class Solution {
    public int minimumSum(int num) {
        int arr[]=new int[4];
        //int d=0;
        for (int i=0; i<4; i++)
        {
            
            arr[i]=num%10;
            num=num/10;
            
        }
        Arrays.sort(arr);
        int sum=(10*(arr[0]+arr[1])+arr[2]+arr[3]);
        return sum;
    }
}