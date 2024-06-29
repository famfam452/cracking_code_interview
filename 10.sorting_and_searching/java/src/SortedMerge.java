public class SortedMerge {
    public int[] merge(int[] a, int[] b, int lastA, int lastB) {
        int indexA = lastA - 1;
        int indexB = lastB - 1;
        int indexMerged = indexA + indexB - 1;
        System.out.println(indexMerged);
        int[] new_out = new int[indexMerged + 1];
        while (indexMerged >= 0) {
            if (indexA >= 0 && a[indexA] > b[indexB]) {
                new_out[indexMerged] = a[indexA];
                indexA--;
            } else {
                new_out[indexMerged] = b[indexB];
                indexB--;
            }
            indexMerged--;
        }
        return new_out;
    }
}
