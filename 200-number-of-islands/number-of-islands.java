class pair{
    int first;
    int second;
    public pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    private void bfs(int ro ,int co,int[][]vis,char[][]grid){
        vis[ro][co] = 1;
        Queue <pair> q= new LinkedList<>();
        q.add(new pair(ro,co));

        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();

            int[] dr = {-1, 0, 1, 0};
            int[] dc = {0, 1, 0, -1};

            for (int i = 0; i < 4; i++) {

                int nrow = row + dr[i];
                int ncol = col + dc[i];

                if (nrow >= 0 && nrow < grid.length &&
                    ncol >= 0 && ncol < grid[0].length &&
                    vis[nrow][ncol] == 0 &&
                    grid[nrow][ncol] == '1') {

                    vis[nrow][ncol] = 1;
                    q.add(new pair(nrow, ncol));
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int [][] vis = new int[grid.length][grid[0].length];
        int count =0;
        for(int row = 0;row<grid.length;row++){
            for(int col =0;col<grid[0].length;col++){
                if(vis[row][col] == 0 && grid[row][col] == '1'){
                    count++;
                    bfs(row,col,vis,grid);
                }
            }
        }
        return count;
    }
}