import java.util.List;

public class Main {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        RobotInAGrid robotInAGrid = new RobotInAGrid();
        List<Point> path = robotInAGrid.getPath(new boolean[][]{{true, true, false, false},{false, true, true, false},{false, false, true, false},{false, false, true, true}});
        for (Point p: path) {
            System.out.printf("%d,%d ", p.getCol(), p.getRow());
        }
    }
}