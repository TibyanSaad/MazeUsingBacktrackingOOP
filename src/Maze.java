
import java.io.FileWriter;
import java.io.IOException;



public class Maze {
    public static void storeMaze() {
        try {
            FileWriter writer = new FileWriter("src/main/java/org/example/fromtibyan/sprint5/escapemazeoop/maze.txt");
            for (int row = 0; row < MazeLoader.mazeArray.size(); row++) {
                for (int column = 0; column < MazeLoader.mazeArray.get(0).length(); column++) {
                    writer.write(MazeLoader.mazeArray2D[row][column]);
                }
                writer.write("\n");
                System.out.println();
            }writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isWall(int row, int col) {
        return MazeLoader.mazeArray2D[row][col] == '1';
    }

    public static boolean isExit(int row, int col) {
        return MazeLoader.mazeArray2D[row][col] == 'E';
    }

    public static boolean isSymbol(int row, int col) {
        return MazeLoader.mazeArray2D[row][col] == '@';
    }
}
