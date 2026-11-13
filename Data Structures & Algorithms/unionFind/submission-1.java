class UnionFind {
    private int[] parent;
    private int[] rank;
    int count;
    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        count = n;
        for(int i =0 ; i < n; i++){
            parent[i] = i;
            rank[i] = 1;
        }
    }

    public int find(int x) {
        if(parent[x] != x){
            parent[x] = find(parent[x]);
        }

        return parent[x];
    }

    public boolean isSameComponent(int x, int y) {
        return find(x) == find(y);
    }

    public boolean union(int x, int y) {
        int rootx = find(x);
        int rooty = find(y);
        
        if(rootx == rooty){
            return false;
        }

        if(rank[rootx] > rank[rooty]){
            parent[rooty] = rootx;
        }else if(rank[rootx] < rank[rooty]){
            parent[rootx] = rooty;
        }else{
            parent[rooty] = rootx;
            rank[rootx]++;
        }

        count--;
        return true;
    }

    public int getNumComponents() {
        return count;
    }
}
