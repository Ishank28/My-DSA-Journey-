package backtracking;

public class sudoku {

    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        // Check the vertical column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        
        // Check the horizontal row
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        // Check the grid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printSudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean sudokuSolver(int[][] sudoku, int row, int col) {
        // Base case
        if (row == 9) {
            return true;
        }
        
        // Calculate the coordinates of the next cell
        int nextRow = row;
        int nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }
        
        // Skip cells that are already filled
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        
        // Try adding digits from 1 to 9
        for (int digit = 1; digit <= 9; digit++) {
            // Check if it's safe to place the digit
            if (isSafe(sudoku, row, col, digit)) {
                // Place the digit
                sudoku[row][col] = digit;
                
                // Recursively check the next cell
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true; // Solution exists
                }
                
                // If the current placement doesn't lead to a solution, backtrack
                sudoku[row][col] = 0;
            }
        }
        
        return false; // No solution found in this branch
    }

    public static void main(String[] args) {
        int sudoku[][] = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };

        if (sudokuSolver(sudoku, 0, 0)) {
            printSudoku(sudoku);
        } else {
            System.out.println("SOLUTION DOES NOT EXIST");
        }
    }
}



