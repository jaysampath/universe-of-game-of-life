package org.universe.gameoflife;

public class Universe {
    private final int[][] grid;
    private final int size;

    // Offsets representing the relative coordinates of the 8 neighbors surrounding a cell.
    // Each (dx[i], dy[i]) pair corresponds to one of the adjacent cells — horizontal, vertical, or diagonal.
    private static final int[] dx = {-1, -1, -1, 0,  0,  1, 1, 1};
    private static final int[] dy = {-1,  0,  1, -1, 1, -1, 0, 1};

    public Universe(int size) {
        grid = new int[size][size];
        this.size = size;
        System.out.println("Initializing Glider pattern");
        initializeGlider();
    }

    private void initializeGlider() {
        int mid = size/2;
        grid[mid - 1][mid] = 1;
        grid[mid][mid + 1] = 1;
        grid[mid + 1][mid - 1] = 1;
        grid[mid + 1][mid] = 1;
        grid[mid + 1][mid + 1] = 1;
    }

    public void nextGeneration() {
        //First Pass
        //Mark alive -> dead as 2, dead -> alive as 3
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int liveNeighbours = countLiveNeighbours(i, j);
                if (grid[i][j] == 1) {
                    if (liveNeighbours < 2 || liveNeighbours > 3) {
                        grid[i][j] = 2; // alive to dead
                    }
                } else if (grid[i][j] == 0) {
                    if (liveNeighbours == 3) {
                        grid[i][j] = 3; // dead to alive
                    }
                }
            }
        }

        //second pass
        //finalize alive and dead cells
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i][j] == 2) {
                    grid[i][j] = 0;
                } else if (grid[i][j] == 3) {
                    grid[i][j] = 1;
                }
            }
        }
    }

    private int countLiveNeighbours(int i, int j) {
        int liveNeighboursCount = 0;
        for(int d = 0; d < 8; d++) {
            int ni = i + dx[d];
            int ny = j + dy[d];
            if (ni >= 0 && ni < size && ny >= 0 && ny < size) {
                if (grid[ni][ny] ==  1 || grid[ni][ny] == 2) {
                    liveNeighboursCount++;
                }
            }
        }
        return liveNeighboursCount;
    }

    public void print(boolean useAstreikAndDotWhilePrinting) {
        System.out.println("Current state of Universe:");
        for (int i = 0; i < size; i++) {
            for (int j = 0 ; j < size; j++) {
                if (useAstreikAndDotWhilePrinting) {
                    System.out.print((grid[i][j] == 1 ? '*' : '.'));
                } else {
                    System.out.print(grid[i][j] + " ");
                }

            }
            System.out.println();
        }
        System.out.println();
    }
}