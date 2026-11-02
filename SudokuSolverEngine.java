
public class SudokuSolverEngine {

    // Runs and tests the Sudoku solver.
    public static void main(String[] args) {

        MySudokuBoard board = new MySudokuBoard("boards/fast-solve.sdk");
        System.out.println("Initial board");
        System.out.println(board);

        if (!board.isValid()) {
            System.out.println("The board cannot be solved.");

        } else if (board.isSolved()) {
            System.out.println("The board is already solved.");

        } else {
            System.out.print("Solving board...");

            long start = System.nanoTime();

            boolean solved = board.solve();

            long end = System.nanoTime();

            double seconds = (end - start) / 1000000000.0;

            if (solved) {
                System.out.printf("SOLVED in %.3f seconds.%n", seconds);
            } else {
                System.out.println("No solution found.");
            }

            System.out.println();
            System.out.println(board);
        }
    }
}

/*
 Initial board
 +-----------------------+
 | . 3 4 | 6 7 8 | 9 1 2 |
 | . 7 2 | 1 9 5 | 3 4 8 |
 | 1 9 8 | 3 4 2 | 5 6 7 |
 |-------|-------|-------|
 | . . 9 | . 6 1 | 4 2 3 |
 | . 2 6 | 8 5 3 | 7 9 1 |
 | . 1 3 | 9 2 4 | . 5 6 |
 |-------|-------|-------|
 | . 6 1 | 5 3 7 | 2 8 4 |
 | . 8 . | 4 1 9 | 6 3 5 |
 | 3 4 5 | . 8 6 | 1 7 9 |
 +-----------------------+
 
 Solving board...SOLVED in 0.002 seconds.
 
 +-----------------------+
 | 5 3 4 | 6 7 8 | 9 1 2 |
 | 6 7 2 | 1 9 5 | 3 4 8 |
 | 1 9 8 | 3 4 2 | 5 6 7 |
 |-------|-------|-------|
 | 8 5 9 | 7 6 1 | 4 2 3 |
 | 4 2 6 | 8 5 3 | 7 9 1 |
 | 7 1 3 | 9 2 4 | 8 5 6 |
 |-------|-------|-------|
 | 9 6 1 | 5 3 7 | 2 8 4 |
 | 2 8 7 | 4 1 9 | 6 3 5 |
 | 3 4 5 | 2 8 6 | 1 7 9 |
 +-----------------------+
 

*/
