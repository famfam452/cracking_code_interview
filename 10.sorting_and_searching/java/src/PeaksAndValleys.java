public class PeaksAndValleys {
    void sortValleyPeak(int[] array) {
        for (int i = 1; i < array.length; i += 2) {
            int biggestIndex = maxIndex(array, i - 1, i, i + 1);
            if (i != biggestIndex) {
                swap(array, i, biggestIndex);
            }
        }
    }
    int maxIndex(int[] array, int a, int b, int c) {
        int len_array = array.length;

        int aVal = a >= 0 && a < len_array ? array[a]: Integer.MIN_VALUE;
        int bVal = b >= 0 && b < len_array ? array[b]: Integer.MIN_VALUE;
        int cVal = c >= 0 && c < len_array ? array[c]: Integer.MIN_VALUE;

        int max = Math.max(aVal, Math.max(bVal, cVal));
        if (max == aVal) return a;
        else if (max == bVal) return b;
        else return c;
    }
    void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
