import java.io.*;
import java.util.*;

public class Main {
    static int R, C, K;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int answer = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        R = Integer.parseInt(input[0]);
        C = Integer.parseInt(input[1]);
        K = Integer.parseInt(input[2]);
        
        map = new char[R][C];
        visited = new boolean[R][C];
        
        for (int i = 0; i < R; i++) {
            map[i] = br.readLine().toCharArray();
        }
        
        visited[R-1][0] = true;
        dfs(R-1, 0, 1);
        
        System.out.println(answer);
    }
    
    static void dfs(int x, int y, int dist) {
        if (x == 0 && y == C-1) {
            if (dist == K) {
                answer++;
            }
            return;
        }
        
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (nx < 0 || nx >= R || ny < 0 || ny >= C) continue;
            if (visited[nx][ny] || map[nx][ny] == 'T') continue;
            
            visited[nx][ny] = true;
            dfs(nx, ny, dist + 1);
            visited[nx][ny] = false;
        }
    }
}