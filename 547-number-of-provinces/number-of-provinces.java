class Solution {
    private void dfs(int k,List<List<Integer>> list,int[] vis){
        vis[k] = 1;

        for(Integer it : list.get(k)){
            if(vis[it] == 0){
                dfs(it,list,vis);
            }
        }
    } 

    public int findCircleNum(int[][] isConnected) {

        int v = isConnected.length;
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<v;i++){
            list.add(new ArrayList<Integer>());
        }
        for(int i = 0;i<v;i++){
            for(int j=0;j<v;j++){
                if(isConnected[i][j] == 1 && i!=j){
                    list.get(i).add(j);
                    list.get(j).add(i);
                }
            }
        }
        int[] vis = new int[v+1];
        int cnt =0;
        for(int k =0;k<v;k++){
            if(vis[k]==0){
                cnt++;
                dfs(k,list,vis);
            }
        }
        return cnt;
    }
}