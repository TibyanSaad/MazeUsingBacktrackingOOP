
import java.util.ArrayList;


public class MazeRenderer {
    static ArrayList<String> pathCoordinates = new ArrayList<>();

    public static void printMaze() {
        MazeLoader.mazeArray2D[MazeSolver.r][MazeSolver.c] = '@';
        for (char[] maze : MazeLoader.mazeArray2D) {
            System.out.println(maze);
        }
        for (int space = 0; space < 4; space++) {
            System.out.println();
        }
    }

    public static void mazeDelay() {
        MazeLoader.mazeArray2D[MazeSolver.r][MazeSolver.c] = '-';
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void symbolCoordinates() {
        pathCoordinates.add("(" + MazeSolver.r + "," + MazeSolver.c + ") ");
    }

    public static void printPath() {
        for (String path : pathCoordinates) {
            System.out.print(path + " ");
        }
        System.out.println();
    }
}
