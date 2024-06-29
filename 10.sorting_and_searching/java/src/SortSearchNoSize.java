public class SortSearchNoSize {
    public int search(Listy listy, int value) {
        int index = 1;
        while (listy.elementAt(index) != -1 && listy.elementAt(index) < value) {
            index *= 2;
        }
        return binarySearch(listy, value, index /2, index);
    }

    public int binarySearch(Listy listy, int value, int low, int high) {
        while (low <= high) {
            int middle = (low + high)/2;
            if (listy.elementAt(middle) == -1 || listy.elementAt(middle) > value) {
                high = middle - 1;
            } else if (listy.elementAt(middle) < value) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static class Listy {
        private int[] list;
        protected int length;
        public Listy(int[] list) {
            this.list = list;
            this.length = list.length;
        }
        public int elementAt(int index) {
            if (index < this.length) {
                return list[index];
            }
            return -1;
        }
    }
}
