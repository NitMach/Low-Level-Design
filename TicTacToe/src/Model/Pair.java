package Model;

public class Pair<K, V> {
    private K key;
    private V value;

    // Constructor
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getter for the key
    public K getKey() {
        return key;
    }

    // Setter for the key
    public void setKey(K key) {
        this.key = key;
    }

    // Getter for the value
    public V getValue() {
        return value;
    }

    // Setter for the value
    public void setValue(V value) {
        this.value = value;
    }
}

