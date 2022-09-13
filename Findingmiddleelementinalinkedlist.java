class Solution
{
    int getMiddle(Node head)
    {
        Node temp=head;
        int count=1;
        while(temp.next!=null){
            count++;
            temp=temp.next;
            
        }
        int half=count/2 + 1;
        // Node temp=head;
        for(int i=0; i<count/2; i++){
            head=head.next;
            
        }
        return head.data;
         // Your code here.
    }
}
