import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RobotInAGrid {
    public List<Point> getPath(boolean[][] maze) {
        List<Point> path = new ArrayList<>();
        HashSet<Point> failPoint = new HashSet<>();
        getPath(path, maze.length -1, maze[0].length - 1, maze, failPoint);
        return path;
    }
    public Boolean getPath(List<Point> path, int row, int col, boolean[][] maze, HashSet<Point> failPoint) {
        if (row < 0 || col < 0 || !maze[row][col]) {
            return false;
        }
        boolean isOrigin = (row == 0 && col == 0);
        Point point = new Point(row, col);
        if (failPoint.contains(point)) {return false;}
        if (isOrigin || getPath(path, row - 1, col, maze, failPoint) || getPath(path, row, col - 1, maze, failPoint) || maze[row][col]) {
            path.add(point);
            return true;
        }
        failPoint.add(point);
        return false;
    }
}


//(0, 0) (1, 0) (2, 0) (3, 0);
//(0, 1) (1, 1) (2, 1) (3, 1);
//(0, 2) (1, 2) (2, 2) (3, 2);
//(0, 3) (1, 3) (2, 3) (3, 3);