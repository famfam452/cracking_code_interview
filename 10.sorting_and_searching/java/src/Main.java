import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            SparseSearch sparseSearch = new SparseSearch();
             int result = sparseSearch.search(new String[]{"apple", "", "","bird", "","","","end", "love"}, "love");
             System.out.println(result);
            return;
    }
}