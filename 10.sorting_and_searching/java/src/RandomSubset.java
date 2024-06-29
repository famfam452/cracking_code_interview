import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RandomSubset {
    List<Integer> getRandomOfSubset(List<Integer> mainSet) {
        Random random = new Random();
        Predicate<Object> predicate = o -> random.nextBoolean();
        return mainSet.stream().filter(k -> random.nextBoolean()).toList();
    }


}
