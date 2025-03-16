class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{Key=" + key + ", Value=" + value + "}";
    }
}

public class PairMainQ8 {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "Apple");
        Pair<Integer, String> pair2 = new Pair<>(2, "Banana");
        Pair<Integer, String> pair3 = new Pair<>(3, "Cherry");

        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair3);
    }
}
