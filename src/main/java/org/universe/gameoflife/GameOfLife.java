package org.universe.gameoflife;

public class GameOfLife {
    public static void main(String[] args) throws InterruptedException {
        int size = 25;
        int generations = 25;
        // optional for better visibility in console output
        boolean useStarAndDotWhilePrinting = true;

        Universe universe = new Universe(size);


        for (int gen = 1; gen <= generations; gen++) {
            System.out.println("Generation- "+ gen + ":");
            universe.print(useStarAndDotWhilePrinting);
            universe.nextGeneration();

            //Add delay to visualize logs in the console
            Thread.sleep(500);
        }
    }
}
