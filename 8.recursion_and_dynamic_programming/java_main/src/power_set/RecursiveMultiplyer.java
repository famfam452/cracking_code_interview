package power_set;

public class RecursiveMultiplyer{
    int product(int number1,int number2) {
        int smaller = Math.min(number2, number1);
        int bigger = Math.max(number1, number2);
        return productHelper(smaller, bigger);
    }
    int productHelper(int smaller, int bigger) {
        if (smaller == 0) {
            return 0;
        }
        if (smaller == 1) {
            return bigger;
        }

        int half_small = smaller >> 1;
        int first_half_product = product(half_small, bigger);
        if (smaller % 2 == 1) {
            return first_half_product + product(smaller - half_small, bigger);
        }
        return first_half_product + first_half_product;
    }
}
