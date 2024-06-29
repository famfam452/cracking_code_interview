import java.util.HashMap;

public class TrippleStep {
    private HashMap<Integer, Long> memory;
    public TrippleStep() {
        this.memory = new HashMap<>();
    }
    public Long count_possible_step(int stair_level) {
        if (stair_level < 0 ) {
            return 0L;
        }
        if (stair_level == 0) {
            return 1L;
        }
        if (memory.containsKey(stair_level)) {
            return memory.get(stair_level);
        } else {
            Long result = count_possible_step(stair_level - 1) + count_possible_step(stair_level - 2) + count_possible_step(stair_level - 3);
            memory.put(stair_level, result);
            return result;
        }
    }
}