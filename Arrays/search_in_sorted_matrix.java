public class search_in_sorted_matrix {

    public static boolean staircaseSearch(int[][] matrix, int key){
        int row = 0;
        int col = 0;

        while(row < matrix.length && col < matrix[0].length){
            if(matrix[row][col] == key){
                System.out.print("found at :"+ "("+ row + "," + col +")");
                return true;
            }
            else if(key > matrix[row][col]){
                col++;
            } else {
                row ++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    
    public static void main(String[] args) {
        int[][] matrix= {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };

        int key = 30;
        staircaseSearch(matrix, key);
    }
}
