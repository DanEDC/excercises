package pl.coderstrust.MyHash;

import java.util.*;

public class MyHashMap<K, V> implements Map<K, V> {

  @SuppressWarnings("unchecked")
  private List<MyEntry<K, V>>[] elements = new ArrayList[101];

  @Override
  public int size() {

    int count = 0;
    for (int i = 0; i < elements.length; ++i) {
      if (elements[i] != null) {
        List<MyEntry<K, V>> entries = elements[i];
        for (MyEntry<K, V> entry : entries) {
          if (entry != null) {
            count += 1;
          }
        }
      }
    }
    return count;
  }

  @Override
  public boolean isEmpty() {
    return (this.size() == 0);
  }

  @Override
  public boolean containsKey(Object key) {

    for (int i = 0; i < elements.length; ++i) {

      if (elements[i] != null) {
        List<MyEntry<K, V>> entries = elements[i];
        for (MyEntry<K, V> entry : entries) {
          if (entry.key != null && entry.key.equals(key)) {
            return true;
          }
        }
      }
    }
    return false;
  }

  @Override
  public boolean containsValue(Object value) {

    for (int i = 0; i < elements.length; ++i) {
      if (elements[i] != null) {
        List<MyEntry<K, V>> entries = elements[i];
        for (MyEntry<K, V> entry : entries) {
          if (entry.value != null && entry.value.equals(value)) {
            return true;
          }
        }
      }
    }
    return false;
  }

  @Override
  public V get(Object key) {

    int index = Math.abs(key.hashCode() % elements.length);
    List<MyEntry<K, V>> entries = elements[index];

    if (entries == null || entries.isEmpty()) {
      return null;
    }

    for (MyEntry<K, V> entry : entries) {
      if (entry.key.equals(key)) {
        return entry.value;
      }
    }
    return null;
  }

  @Override
  public V put(K key, V value) {

    int index = Math.abs(key.hashCode() % elements.length);
    if (elements[index] == null) {
      elements[index] = new ArrayList<>();
    }
    elements[index].add(new MyEntry<K, V>(key, value));
    return value;
  }

  @Override
  public V remove(Object key) {

    int index = Math.abs(key.hashCode() % elements.length);

    List<MyEntry<K, V>> entries = elements[index];

    if (entries == null || entries.isEmpty()) {
      return null;
    }

    for (int i = (entries.size() - 1); i >= 0; --i) {
      MyEntry<K, V> e = entries.get(i);
      if (e.key.equals(key)) {
        entries.remove(i);
      }
    }
    return null;
  }

  @Override
  public void putAll(Map<? extends K, ? extends V> m) {

    for (Entry<? extends K, ? extends V> e : m.entrySet()) {
      this.put(e.getKey(), e.getValue());
    }
  }

  @Override
  public void clear() {

    for (int i = 0; i < elements.length; ++i) {
      elements[i] = null;
    }
  }

  @Override
  public Set<K> keySet() {

    Set<K> mySet = new HashSet<K>();
    for (int i = 0; i < elements.length; ++i) {
      if (elements[i] != null) {
        List<MyEntry<K, V>> entries = elements[i];
        for (MyEntry<K, V> entry : entries) {
          mySet.add(entry.key);
        }
      }
    }
    return mySet;
  }

  @Override
  public Collection<V> values() {

    Collection<V> myCollection = new ArrayList<V>();
    for (int i = 0; i < elements.length; ++i) {
      if (elements[i] != null) {
        List<MyEntry<K, V>> entries = elements[i];
        for (MyEntry<K, V> entry : entries) {
          myCollection.add(entry.value);
        }
      }
    }
    return myCollection;
  }

  @Override
  public Set<Entry<K, V>> entrySet() {

    Set<Entry<K, V>> myEntrySet = new HashSet<Entry<K, V>>();

    for (int i = 0; i < elements.length; ++i) {
      if (elements[i] != null) {
        List<MyEntry<K, V>> entries = elements[i];
        for (MyEntry<K, V> entry : entries) {
          myEntrySet.add(entry);
        }
      }
    }

    return myEntrySet;
  }

  private static class MyEntry<K, V> implements Entry<K, V> {

    K key;
    V value;

    MyEntry(K key, V value) {
      this.key = key;
      this.value = value;
    }

    @Override
    public K getKey() {
      return key;
    }

    @Override
    public V getValue() {
      return value;
    }

    @Override
    public V setValue(V value) {
      this.value = value;
      return value;
    }

    public String toString() {
      String stringEntry = key + "=" + value;
      return stringEntry;
    }
  }
}
