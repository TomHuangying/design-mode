package hashMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyHashMap<K,V>   {

    private Entry[] table;
    private static final  Integer DEFULT_TABLE_SIZE=8;
    public MyHashMap(Integer tablesize) {
        table = new Entry[tablesize];
    }
    public MyHashMap( ) {
       table = new Entry[DEFULT_TABLE_SIZE];
    }

//    @Override
    public int size() {
        return 0;
    }

//    @Override
    public boolean isEmpty() {
        return false;
    }

//    @Override
    public boolean containsKey(Object o) {
        return false;
    }

//    @Override
    public boolean containsValue(Object o) {
        return false;
    }

//    @Override
    public V get(K key) {
        int hash = hash(key);
        int i = hash%8;
        for(Entry<K,V> entry = table[i];entry!=null; entry = entry.next){
            if(entry.key.equals(key)){
                return entry.value;
            }
        }
        return null;
    }

//    @Override
//    插入数据
    public V put(K key, V value) {

        int hash  = key.hashCode();
        int i = hash%8;
//        循环链表
        for(Entry<K,V> entry = table[i];entry!=null; entry = entry.next){
            if(entry.key.equals(key)){
                V oldValue = entry.value;
                entry.value = value;
                return oldValue;
            }
        }
        Entry entry = new Entry(key,value,table[i]);
        return null;
    }


    public Integer hash(K key){
        return key.hashCode();
    }
//    @Override
    public Object remove(Object o) {
        return null;
    }

//    @Override
    public void putAll(Map map) {

    }

//    @Override
    public void clear() {

    }

//    @Override
    public Set keySet() {
        return null;
    }

//    @Override
    public Collection values() {
        return null;
    }

//    @Override
    public Set<Entry> entrySet() {
        return null;
    }

    class Entry<K,V> implements Map.Entry{
         private K key;

        public Entry(K key, V value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        private V value;
         private Entry next;

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public Object setValue(Object o) {
            return null;
        }
    }
}
