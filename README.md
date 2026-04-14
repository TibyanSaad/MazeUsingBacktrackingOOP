# Maze Solver Using Stack Backtracking (Object-Oriented Java Program)

## Overview
This project is an **object-oriented maze solver** written in Java.  
It reads a maze layout from a text file, validates the maze structure, and attempts to find a path from the start (`@`) to the exit (`E`) using a depth-first search (DFS) algorithm with a stack. The program has been refactored into multiple classes to separate responsibilities and improve maintainability.

## Features
- Reads maze layout from `maze.txt`
- Converts maze into a 2D character array
- Validates maze conditions:
  - Exactly one start symbol (`@`) and one exit (`E`)
  - Borders must be walls (`1`)
- Uses an Array to track already explored paths
- Displays the maze step-by-step as the solver moves
- Stores maze state back into `maze.txt`
- Prints the path coordinates taken by the solver
- Displays whether the maze is solved or no path is found

## Core Classes
1. **Maze**  
   - Handles maze storage and validation helpers (`isWall`, `isExit`, `isSymbol`)  
   - Writes maze state to file  

2. **MazeLoader**  
   - Reads maze from `maze.txt`  
   - Converts maze into a 2D array  
   - Validates maze structure (symbols and borders)  
   - Initializes start position and triggers solver  

3. **MazeRenderer**  
   - Prints maze state to console  
   - Adds delays for visualization  
   - Tracks and prints path coordinates  

4. **MazeSolver**  
   - Implements DFS using a stack  
   - Moves through maze until exit is found  
   - Calls renderer and storage methods during traversal  

5. **Position**  
   - Simple class to store row and column coordinates  

## How to Run (Windows CMD)
1. Navigate to your project folder:
   ```cmd
   cd C:\Users\YourName\MazeSolverOOP\src
2. Compile the program:
   ```cmd
   javac MazeApp.java
3. Run the program with a direction (and optional steps (deafualt is 1)):
   ```cmd
   java MazeApp map.txt
