import java.util.LinkedList;

class LinkedListt {
    
    public static LinkedList<Integer> createLinkedList() {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(78);
        l.add(76);
        l.add(100);
        return l;
    }
    
    public static void main(String[] args) {
        LinkedList<Integer> list = createLinkedList();
        System.out.println(list);
    }
}