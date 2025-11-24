import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    static int n, m;
    static char[][] campus;
    static boolean[][] visited;
    static int count = 0;
    
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        campus = new char[n][m];
        visited = new boolean[n][m];

        int startX = 0, startY = 0;
        
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                campus[i][j] = line.charAt(j);
                if (campus[i][j] == 'I') {
                    startX = i;
                    startY = j;
                }
            }
        }
        
        dfs(startX, startY);
        
        if (count == 0) {
            System.out.println("TT");
        } else {
            System.out.println(count);
        }
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;
        
        if (campus[x][y] == 'P') {
            count++;
        }
        
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                if (!visited[nx][ny] && campus[nx][ny] != 'X') {
                    dfs(nx, ny);
                }
            }
        }
    }
}