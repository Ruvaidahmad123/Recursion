class Solution {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        if(head.data==head.next.data){
            head.next=head.next.next;
            removeDuplicates(head);
        }
        else{
            removeDuplicates(head.next);
        }
        return head;
    }
}
