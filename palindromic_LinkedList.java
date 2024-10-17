class Solution {
    Node left;
    boolean isPalindrome(Node head) {
        left = head;
        return checkPalindrome(head);
    }
    
    // Recursive function to check if the linked list is a palindrome
    boolean checkPalindrome(Node right) {
        // Base case: when right reaches the end
        if (right == null) {
            return true;
        }
        
        // Recursively call for the next node in the list
        boolean isPalindrome = checkPalindrome(right.next);
        
        // If the rest of the list is not a palindrome, return false
        if (!isPalindrome) {
            return false;
        }
        
        // Compare the current right node with the corresponding left node
        boolean isSame = (left.data == right.data);
        
        // Move left pointer to the next node
        left = left.next;
        
        return isSame;
    }
}
