class Solution
{
    
    public static ArrayList<Integer> Ancestors(Node root, int target)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        isPresent(root,target,ans);
        return ans;
        // add your code here
    }
    public static boolean isPresent(Node root,int target,ArrayList<Integer>ans){
        if(root==null) return false;
        if(root.data==target) return true;
        if(isPresent(root.left,target,ans) || isPresent(root.right,target,ans)){
            ans.add(root.data);
            return true;
        }
        return false;
    }
}
