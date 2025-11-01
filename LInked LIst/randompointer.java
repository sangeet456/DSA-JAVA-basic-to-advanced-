import java.util.*;

// Node class definition
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        
        // Step 1: Create copy nodes and insert them alternately
        Node temp1 = head;
        while (temp1 != null) {
            Node copy = new Node(temp1.val);
            copy.next = temp1.next;
            temp1.next = copy;
            temp1 = copy.next;
        }
        
        // Step 2: Assign random pointers for copy nodes
        temp1 = head;
        while (temp1 != null) {
            if (temp1.random != null) {
                temp1.next.random = temp1.random.next;
            }
            temp1 = temp1.next.next;
        }
        
        // Step 3: Separate the lists
        Node head2 = head.next;
        temp1 = head;
        Node temp2 = head2;
        
        while (temp1 != null) {
            temp1.next = temp1.next.next;
            temp1 = temp1.next;
            
            if (temp2.next != null) {
                temp2.next = temp2.next.next;
                temp2 = temp2.next;
            }
        }
        
        return head2;
    }
}

public class randompointer {
    public static void main(String[] args) {
        // Create original linked list: 1 -> 2 -> 3 -> 4
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        
        // Set random pointers
        node1.random = node3; // 1 -> 3
        node2.random = node1; // 2 -> 1
        node3.random = node3; // 3 -> 3
        node4.random = node2; // 4 -> 2
        
        System.out.println("Original list:");
        printList(node1);
        
        // Create deep copy
        Solution solution = new Solution();
        Node copiedHead = solution.copyRandomList(node1);
        
        System.out.println("Copied list:");
        printList(copiedHead);
        
        // Verify they are different objects but same structure
        System.out.println("\nVerification:");
        System.out.println("Original and copy are different objects: " + (node1 != copiedHead));
        System.out.println("But have same structure: " + compareLists(node1, copiedHead));
    }
    
    // Helper method to print the list with random pointers
    public static void printList(Node head) {
        Node temp = head;
        Map<Node, Integer> nodeToIndex = new HashMap<>();
        int index = 0;
        
        // First pass: map nodes to indices
        Node current = head;
        while (current != null) {
            nodeToIndex.put(current, index++);
            current = current.next;
        }
        
        // Second pass: print with indices
        temp = head;
        while (temp != null) {
            String randomInfo = (temp.random == null) ? "null" : String.valueOf(nodeToIndex.get(temp.random));
            System.out.println("Node " + nodeToIndex.get(temp) + ": value=" + temp.val + 
                             ", next=" + (temp.next != null ? nodeToIndex.get(temp.next) : "null") +
                             ", random=" + randomInfo);
            temp = temp.next;
        }
    }
    
    // Helper method to compare two lists
    public static boolean compareLists(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        
        Map<Node, Node> originalToCopy = new HashMap<>();
        
        // Map original nodes to copy nodes
        Node curr1 = head1;
        Node curr2 = head2;
        while (curr1 != null && curr2 != null) {
            originalToCopy.put(curr1, curr2);
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        
        // Verify structure
        temp1 = head1;
        temp2 = head2;
        while (temp1 != null && temp2 != null) {
            // Check values
            if (temp1.val != temp2.val) return false;
            
            // Check random pointers
            if (temp1.random == null) {
                if (temp2.random != null) return false;
            } else {
                if (temp2.random == null) return false;
                if (temp2.random != originalToCopy.get(temp1.random)) return false;
            }
            
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        return temp1 == null && temp2 == null;
    }
}