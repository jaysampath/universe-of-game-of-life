# Universe of Game of Life
## ChargePoint Interview Take Home Assignment

This project is the implementation of Game Of Life Algorithm

### Rules of the Game
Each cell on a 2D grid is either alive or dead.
At every generation, the following transitions occur:
* Any live cell with fewer than two live neighbors dies as if caused by underpopulation.
* Any live cell with two or three live neighbors lives on to the next generation.
* Any live cell with more than three live neighbors dies, as if by overcrowding.
* Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.

### Runbook
* Algorithm implementation - <a href="https://github.com/jaysampath/universe-of-game-of-life/blob/main/src/main/java/org/universe/gameoflife/Universe.java"> Universe.java </a>
* Navigate to Driver Program - <a href="https://github.com/jaysampath/universe-of-game-of-life/blob/main/src/main/java/org/universe/gameoflife/GameOfLife.java"> GameOfLife.java </a>
* Configure grid size and number of generations
* Run `GameOfLife` driver class
* Console output of 25 generations - <a href="https://github.com/jaysampath/universe-of-game-of-life/blob/main/src/main/resources/console_output_of_25_generations.txt"> console_output_of_25_generations.txt </a>

### Understanding the Console Output

- **Initial Configuration:**  
  The simulation runs on a **25×25 grid** for **25 generations**.

- **Visualization:**  
  * For better readability in the console output:
    - Alive cells are displayed as `*`
    - Dead cells are displayed as `.` 
  * You can control this visualization using the flag `useStarAndDotWhilePrinting`

### System Requirements
* Java 8+
* IDE  (Optional)