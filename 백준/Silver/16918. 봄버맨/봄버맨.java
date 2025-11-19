import java.io.*;
import java.util.*;

public class Main {
    static int R, C, N;
    static char[][] board;
    static int[][] time;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        R = Integer.parseInt(input[0]);
        C = Integer.parseInt(input[1]);
        N = Integer.parseInt(input[2]);
        
        board = new char[R][C];
        time = new int[R][C];
        
        for (int i = 0; i < R; i++) {
            board[i] = br.readLine().toCharArray();
            for (int j = 0; j < C; j++) {
                if (board[i][j] == 'O') {
                    time[i][j] = 3; 
                }
            }
        }
        
        for (int t = 2; t <= N; t++) {
            if (t % 2 == 0) {
                plantBombs(t);
            } else {
                explodeBombs(t);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                sb.append(board[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
    
    static void plantBombs(int t) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (board[i][j] == '.') {
                    board[i][j] = 'O';
                    time[i][j] = t + 3;
                }
            }
        }
    }
    
    static void explodeBombs(int t) {
        boolean[][] toExplode = new boolean[R][C];
        
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (board[i][j] == 'O' && time[i][j] == t) {
                    toExplode[i][j] = true;
                }
            }
        }
        
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (toExplode[i][j]) {
                    board[i][j] = '.';
                    time[i][j] = 0;
                    
                    for (int k = 0; k < 4; k++) {
                        int ni = i + dr[k];
                        int nj = j + dc[k];
                        
                        if (ni >= 0 && ni < R && nj >= 0 && nj < C) {
                            board[ni][nj] = '.';
                            time[ni][nj] = 0;
                        }
                    }
                }
            }
        }
    }
}