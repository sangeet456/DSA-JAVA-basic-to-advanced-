// ListNode class definition
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        if(head.next == null) return false;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null) {
            if(slow == null) return false;
            slow = slow.next;
            
            if(fast.next == null) return false;
            fast = fast.next.next;
            
            if(fast == slow) return true;
        }
        return false;
    }
}

public class cycleinLL{
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test Case 1: List with cycle
        System.out.println("=== Test Case 1: List with Cycle ===");
        ListNode head1 = createListWithCycle(new int[]{1, 2, 3, 4, 5}, 2);
        System.out.println("Has cycle: " + solution.hasCycle(head1));
        System.out.println();
        
        // Test Case 2: List without cycle
        System.out.println("=== Test Case 2: List without Cycle ===");
        ListNode head2 = createListWithoutCycle(new int[]{1, 2, 3, 4, 5});
        System.out.println("Has cycle: " + solution.hasCycle(head2));
        System.out.println();
        
        // Test Case 3: Single node without cycle
        System.out.println("=== Test Case 3: Single Node without Cycle ===");
        ListNode head3 = new ListNode(1);
        System.out.println("Has cycle: " + solution.hasCycle(head3));
        System.out.println();
        
        // Test Case 4: Single node with cycle (self-loop)
        System.out.println("=== Test Case 4: Single Node with Cycle ===");
        ListNode head4 = new ListNode(1);
        head4.next = head4; // Self-loop
        System.out.println("Has cycle: " + solution.hasCycle(head4));
        System.out.println();
        
        // Test Case 5: Empty list
        System.out.println("=== Test Case 5: Empty List ===");
        ListNode head5 = null;
        System.out.println("Has cycle: " + solution.hasCycle(head5));
        System.out.println();
        
        // Test Case 6: Two nodes with cycle
        System.out.println("=== Test Case 6: Two Nodes with Cycle ===");
        ListNode head6 = createListWithCycle(new int[]{1, 2}, 0);
        System.out.println("Has cycle: " + solution.hasCycle(head6));
    }
    
    // Helper method to create a list with cycle
    // cycleStartIndex: 0-based index where cycle starts
    public static ListNode createListWithCycle(int[] values, int cycleStartIndex) {
        if (values.length == 0) return null;
        
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        ListNode cycleStartNode = null;
        
        // Create all nodes and track cycle start node
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
            
            if (i == cycleStartIndex) {
                cycleStartNode = current;
            }
        }
        
        // If cycleStartIndex is 0, cycle starts at head
        if (cycleStartIndex == 0) {
            cycleStartNode = head;
        }
        
        // If no cycleStartNode was set (for last node), set it to last node
        if (cycleStartNode == null) {
            cycleStartNode = current;
        }
        
        // Create cycle by connecting last node to cycle start node
        current.next = cycleStartNode;
        
        System.out.println("Created list with cycle starting at index " + cycleStartIndex + " (value: " + cycleStartNode.val + ")");
        return head;
    }
    
    // Helper method to create a list without cycle
    public static ListNode createListWithoutCycle(int[] values) {
        if (values.length == 0) return null;
        
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        
        System.out.println("Created list without cycle");
        return head;
    }
    
    // Helper method to print list (for debugging - be careful with cycles!)
    public static void printList(ListNode head, int maxNodes) {
        ListNode current = head;
        int count = 0;
        
        System.out.print("List: ");
        while (current != null && count < maxNodes) {
            System.out.print(current.val + " -> ");
            current = current.next;
            count++;
            
            // Safety check to avoid infinite loops with cycles
            if (count >= maxNodes) {
                System.out.print("... (stopped after " + maxNodes + " nodes)");
                break;
            }
        }
        if (current == null) {
            System.out.print("null");
        }
        System.out.println();
    }
}