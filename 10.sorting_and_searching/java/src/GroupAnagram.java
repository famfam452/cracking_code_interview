import java.security.PublicKey;
import java.util.*;

public class GroupAnagram {
    public String sortChar(String s) {
        char[] char_s = s.toCharArray();
        Arrays.sort(char_s);
        return new String(char_s);
    }
    public void sort(ArrayList<String> array) {
        HashMapList<String, String> hashMapList = new HashMapList<String, String>();
        for (String s : array) {
            String key = sortChar(s);
            hashMapList.putValue(key, s);
        }
        int index = 0;
        for (String key: hashMapList.keySet()) {
            ArrayList<String> data = hashMapList.get(key);
            for (String t: data) {
                array.set(index, t);
                index++;
            }
        }

    }
    private static class HashMapList<T,D> implements Map<T,ArrayList<D>> {
        private HashMap<T, ArrayList<D>> hashMapList;

        public HashMapList() {
            hashMapList = new HashMap<T, ArrayList<D>>();
        }

        @Override
        public int size() {
            return hashMapList.size();
        }

        @Override
        public boolean isEmpty() {
            return hashMapList.isEmpty();
        }

        @Override
        public boolean containsKey(Object key) {
            return hashMapList.containsKey(key);
        }

        @Override
        public boolean containsValue(Object value) {
            return hashMapList.containsValue(value);
        }

        @Override
        public ArrayList<D> get(Object key) {
            return hashMapList.get(key);
        }

        @Override
        public ArrayList<D> put(T key, ArrayList<D> value) {
            return hashMapList.put(key, value);
        }
        public void putValue(T key, D value) {
            if (hashMapList.containsKey(key)) {
                hashMapList.get(key).add(value);
            } else {
                ArrayList<D> arrayList = new ArrayList<D>();
                arrayList.add(value);
                hashMapList.put(key, arrayList);
            }
        }

        @Override
        public ArrayList<D> remove(Object key) {
            return hashMapList.remove(key);
        }

        @Override
        public void putAll(Map<? extends T, ? extends ArrayList<D>> m) {
            hashMapList.putAll(m);
        }

        @Override
        public void clear() {
            hashMapList.clear();
        }

        @Override
        public Set<T> keySet() {
            return hashMapList.keySet();
        }

        @Override
        public Collection<ArrayList<D>> values() {
            return hashMapList.values();
        }

        @Override
        public Set<Entry<T, ArrayList<D>>> entrySet() {
            return hashMapList.entrySet();
        }
    }
}
