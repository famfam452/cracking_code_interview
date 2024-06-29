public class SearchInRotatedArray {
    public int binarySearchRotated(int[] array, int left, int right, int value) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;
        if (array[middle] == value) {
            return middle;
        }
        if (array[middle] > array[left]) {
            if (value >= array[left] && value < array[middle]) {
                return binarySearchRotated(array, left, middle - 1, value);
            } else {
                return binarySearchRotated(array, middle + 1, right, value);
            }
        } else if (array[middle] < array[right]) {
            if (value <= array[right] && value > array[middle]) {
                return binarySearchRotated(array, middle + 1, right, value);
            } else {
                return binarySearchRotated(array, left, middle - 1, value);
            }
        } else if (array[left] == array[middle]) {
            if (array[right] != array[middle]) {
                return binarySearchRotated(array, middle + 1, right, value);
            } else {
                int result = binarySearchRotated(array, left, middle - 1, value);
                if (result == -1) {
                    return binarySearchRotated(array, middle + 1, right, value);
                } else {
                    return result;
                }
            }
        }
        return -1;
    }
}
