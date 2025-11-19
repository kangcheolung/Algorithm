import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] dr = {-2, -2, 0, 0, 2, 2};
    static int[] dc = {-1, 1, -2, 2, -1, 1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        
        String[] input = br.readLine().split(" ");
        int r1 = Integer.parseInt(input[0]);
        int c1 = Integer.parseInt(input[1]);
        int r2 = Integer.parseInt(input[2]);
        int c2 = Integer.parseInt(input[3]);
        
        System.out.println(bfs(r1, c1, r2, c2));
    }
    
    static int bfs(int r1, int c1, int r2, int c2) {
        if (r1 == r2 && c1 == c2) {
            return 0;
        }
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][N];
        
        queue.offer(new int[]{r1, c1, 0});
        visited[r1][c1] = true;
        
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int r = cur[0];
            int c = cur[1];
            int dist = cur[2];
            
            for (int i = 0; i < 6; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                
                if (nr < 0 || nr >= N || nc < 0 || nc >= N) continue;
                if (visited[nr][nc]) continue;
                
                if (nr == r2 && nc == c2) {
                    return dist + 1;
                }
                
                visited[nr][nc] = true;
                queue.offer(new int[]{nr, nc, dist + 1});
            }
        }
        
        return -1;
    }
}