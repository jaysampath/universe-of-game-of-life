package org.universe.gameoflife;

public class GameOfLife {
    public static void main(String[] args) {
        int size = 5;

        Universe universe = new Universe(size);
        universe.printGrid();
    }
}
