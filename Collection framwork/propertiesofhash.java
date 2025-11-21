import java.util.*;

public class propertiesofhash {
    static class MyHashMap<K,V> {
        private class Node {
            K key;
            V value;
            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        
        private int n = 0;
        private LinkedList<Node>[] buckets;
        
        public MyHashMap() {
            buckets = new LinkedList[4];
            for(int i=0; i<4; i++) {
                buckets[i] = new LinkedList<>();
            }
        }
        
        private int hash(K key) {
            return Math.abs(key.hashCode()) % buckets.length;
        }
        
        public void put(K key, V value) {
            int bi = hash(key);
            LinkedList<Node> bucket = buckets[bi];
            
            for(Node node : bucket) {
                if(node.key.equals(key)) {
                    node.value = value;
                    return;
                }
            }
            
            bucket.add(new Node(key, value));
            n++;
        }
        
        public V get(K key) {
            int bi = hash(key);
            LinkedList<Node> bucket = buckets[bi];
            
            for(Node node : bucket) {
                if(node.key.equals(key)) {
                    return node.value;
                }
            }
            return null;
        }
        
        public V remove(K key) {
            int bi = hash(key);
            LinkedList<Node> bucket = buckets[bi];
            
            for(Node node : bucket) {
                if(node.key.equals(key)) {
                    bucket.remove(node);
                    n--;
                    return node.value;
                }
            }
            return null;
        }
        
        public int size() {
            return n;
        }
        
        public boolean containsKey(K key) {
            return get(key) != null;
        }
    }
    
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        
        System.out.println("Alice: " + map.get("Alice"));
        System.out.println("Size: " + map.size());
        
        map.remove("Bob");
        System.out.println("After remove - Size: " + map.size());
    }
}