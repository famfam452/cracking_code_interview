import java.util.Objects;

public class SparseSearch {
    public int search(String[] arrayString, String str, int first, int last) {
        if (first > last) {return -1;}
        int mid = (first + last) / 2;

        if (arrayString[mid].isEmpty()) {
            int left = mid - 1;
            int right = mid + 1;
            while (true) {
                if (left < first && right > last) {
                    return -1;
                } else if (left >= first && !arrayString[left].isEmpty()) {
                    mid = left;
                    break;
                } else if (right <= last && !arrayString[right].isEmpty()) {
                    mid = right;
                    break;
                }
                left--;
                right++;
            }
        }
        if (Objects.equals(arrayString[mid], str)) {
            return mid;
        } else if (arrayString[mid].compareTo(str) < 0) {
            return search(arrayString, str, mid + 1, last);
        } else {
            return search(arrayString, str, first, mid - 1);
        }

    }

    public int search(String[] arrayString, String str) {
        if (arrayString.length == 0 || arrayString == null || str.isEmpty()) {
            return -1;
        }
        return search(arrayString, str, 0, arrayString.length - 1);
    }
}
