class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        Node cur=head,prev=null;
        while(cur!=null){
            Node temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
        // code here
    }
}
