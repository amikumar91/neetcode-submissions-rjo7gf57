class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer , Set<Integer>> row = new HashMap<>();
        Map<Integer , Set<Integer>> col = new HashMap<>();
        Map<String , Set<Integer>> grid = new HashMap<>();

        for(int i = 0; i < board.length ; i++){
            for(int j = 0; j < board.length ; j++){
                if(board[i][j] == '.') continue;
                int val = Integer.valueOf(board[i][j]);

                if(row.computeIfAbsent(i , k -> new HashSet<>()).contains(val)){
                    return false;
                }
                row.get(i).add(val);
                
                if(col.computeIfAbsent(j , k -> new HashSet<>()).contains(val)){
                    return false;
                }
                col.get(j).add(val);

                String squareKey = (i/3) + "," + (j/3);

                if(grid.computeIfAbsent(squareKey , k -> new HashSet<>()).contains(val)){
                    return false;
                }
                grid.get(squareKey).add(val);
            }
        }
        return true;
    }
}
