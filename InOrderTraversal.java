class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> list=new ArrayList<>();
        helper(root,list);
        return list;
        
        // Code
        
        
    }
    void helper(Node root,ArrayList<Integer> list){
        if(root==null) return;
        helper(root.left,list);
        list.add(root.data);
        helper(root.right,list);
    }
}
