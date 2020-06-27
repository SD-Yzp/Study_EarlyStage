import java.util.Arrays;

public class GameOfLife {
    public static void main(String[] args){
        int[][] board = {
                {0,1,0},
                {0,0,1},
                {1,1,1},
                {0,0,0}
        };
        gameOfLife_better(board);
        for (int[] ints : board) {
            System.out.println(Arrays.toString(ints));
        }
    }
    public static void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;
                if(i-1>=0){
                    if(j-1>=0){
                        if(board[i-1][j-1]==1){
                            ++count;
                        }
                    }
                    if(j+1<n){
                        if(board[i-1][j+1]==1){
                            ++count;
                        }
                    }
                    if(board[i-1][j]==1){
                        ++count;
                    }
                }
                if(i+1<m){
                    if(j-1>=0){
                        if(board[i+1][j-1]==1){
                            ++count;
                        }
                    }
                    if(j+1<n){
                        if(board[i+1][j+1]==1){
                            ++count;
                        }
                    }
                    if(board[i+1][j]==1){
                        ++count;
                    }
                }
                if(j-1>=0){
                    if(board[i][j-1]==1){
                        ++count;
                    }
                }
                if(j+1<n){
                    if(board[i][j+1]==1){
                        ++count;
                    }
                }
                if(board[i][j]==0&&count==3) {
                    res[i][j] = 1;
                }
                if(board[i][j]==1){
                    if(count==2||count==3){
                        res[i][j] = 1;
                    }else {
                        res[i][j] = 0;
                    }
                }
            }
        }

        for (int[] re : res) {
            System.out.println(Arrays.toString(re));
        }

        for (int i = 0; i < m; i++) {
            System.arraycopy(res[i], 0, board[i], 0, n);
        }
    }
    public static void gameOfLife_better(int[][] board) {
        int m = board.length;
        int n = board[0].length;


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;
                if(i-1>=0){
                    if(j-1>=0){
                        if(board[i-1][j-1]==1||board[i-1][j-1]==-1){
                            ++count;
                        }
                    }
                    if(j+1<n){
                        if(board[i-1][j+1]==1||board[i-1][j+1]==-1){
                            ++count;
                        }
                    }
                    if(board[i-1][j]==1||board[i-1][j]==-1){
                        ++count;
                    }
                }
                if(i+1<m){
                    if(j-1>=0){
                        if(board[i+1][j-1]==1||board[i+1][j-1]==-1){
                            ++count;
                        }
                    }
                    if(j+1<n){
                        if(board[i+1][j+1]==1||board[i+1][j+1]==-1){
                            ++count;
                        }
                    }
                    if(board[i+1][j]==1||board[i+1][j]==-1){
                        ++count;
                    }
                }
                if(j-1>=0){
                    if(board[i][j-1]==1||board[i][j-1]==-1){
                        ++count;
                    }
                }
                if(j+1<n){
                    if(board[i][j+1]==1||board[i][j+1]==-1){
                        ++count;
                    }
                }
                if(board[i][j]==0 && count==3) {
                    board[i][j] = 2;
                }
                if(board[i][j]==1){
                    if(count==2||count==3){
                        board[i][j] = 1;
                    }else {
                        board[i][j] = -1;
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j]==-1){
                    board[i][j] = 0;
                }
                if(board[i][j]==2){
                    board[i][j] = 1;
                }

            }
        }
    }
}
