class Solution{
    public boolean solve(int N, String S1, String S2, String S3){
        char[] ar1=S1.toCharArray();
        char[] ar2=S2.toCharArray();
        char[] ar3=S3.toCharArray();
        
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        Arrays.sort(ar3);
        
        String s_1=new String(ar1);
        
        String s_2= new String(ar2);
        
        String s_3=new String(ar3);
        
       if(s_1.equals(s_2) || s_1.equals(s_3) || s_2.equals(s_3)) return true;
       
       return false;

        
        // Code your solution here.
    }
}
