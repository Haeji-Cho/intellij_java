import java.util.Date;

public class EntryTest {
    public static void main(String[] args) {

        Entry<String, Integer> e1 = new Entry<>("a", 1);
        Entry<String, Date> e2 = new Entry<>("a", new Date());
    }
}
class Entry<K, V>{
    private K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
