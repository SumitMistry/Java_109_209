
    import java.util.*;
/**
 * Write a description of class ChessProblems here.
 *
 * @author (Sumit)
 * @version (109 of 2018)
 */
public class ChessProblems
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ChessProblems
     */
    public ChessProblems()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    

    private static final int[][] knightMoves = {
       {2, 1}, {1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}, {1, -2}, {2, -1}
    };
    
    private static final int[][] WHITE_MOVES = {
        {-1, -1}, {-1, 0}, {-1, 1}
    };
    
    private static final int[][] BLACK_MOVES = {
        {1, -1}, {1, 0}, {1, 1}
    };
    
    
    private static boolean inside(int i, int j, int n) {
        return 0 <= i && i < n && 0 <= j && j < n;
    }
    
    
    public int countSafeSquaresRooks(int n, boolean[][] rooks) {
        int count = 0;
        boolean[] sR = new boolean[n];
        boolean[] sC = new boolean[n];
        Arrays.fill(sR, true);
        Arrays.fill(sC, true);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (rooks[i][j]) {
                    sR[i] = false;
                    sC[j] = false;
                }
            }
        }
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sR[i] && sC[j]) {
                    count++;
                }
            }
        }
        return count ;
    }
    
    public int countKnightMoves(int n, boolean[][] knights) {
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if (knights[i][j]) {
                    
                    for (int[] move : knightMoves) {
                        int row = i + move[0];
                        int col = j + move[1];
                        if (inside(row, col, n) && !knights[row][col]) {
                            count++;
                        }
                    }
                    
                }
                
            }
            
        }
        return count;
    }
    
    public int countPawnMoves(int n, char[][] board) {
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                
                if (board[i][j] == 'w') {
                    for (int[] move: WHITE_MOVES) {
                        int r = i + move[0];
                        int c = j + move[1];
                        char s = move[1] == 0 ? ' ' : 'b';
                        if (inside(r, c, n) && board[r][c] == s) {
                            count++;
                        }
                    }
                }
                
                if (board[i][j] == 'b') {
                    for (int[] move: BLACK_MOVES) {
                        int r = i + move[0];
                        int c = j + move[1];
                        char s = move[1] == 0 ? ' ' : 'w';
                        if (inside(r, c, n) && board[r][c] == s) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
    
    public int countSafeSquaresQueens(int n, boolean[][] queens) {
        int count = 0;
        boolean[] sRow = new boolean[n];
        boolean[] sCol = new boolean[n];
        boolean[] safeSE = new boolean[2 * n - 1];
        boolean[] safeNE = new boolean[2 * n - 1];
        Arrays.fill(sRow, true);
        Arrays.fill(sCol, true);
        Arrays.fill(safeSE, true);
        Arrays.fill(safeNE, true);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if (queens[i][j]) {
                    sRow[i] = false;
                    sCol[j] = false;
                    safeSE[n - i + j - 1] = false;
                    safeNE[i + j] = false;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sRow[i] && sCol[j] && safeSE[n - i + j - 1] && safeNE[i + j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
    
    
    
    
    
    