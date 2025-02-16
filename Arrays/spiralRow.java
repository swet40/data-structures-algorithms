public class spiralRow {
    
    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol){

            //top
            for(int j = startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }

            //right
            for(int i=startRow+1; i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            //bottom
            for(int j=endRow-1; j>=startCol;j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+ " ");
            }

            //left
            for(int i=endRow-1;i>=startCol+1;i--){
                if(startCol == endCol){
                    break;
                }
            System.out.print(matrix[i][startCol]+ " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    //brute force approach- T.C = O(n^2)
    public static int diagonalSum(int[][] matrix){
        int sum = 0;

        // for(int i = 0;i<matrix.length; i++){
        //     for(int j= 0; j<matrix[0].length; j++){
        //         if(i==j){
        //             sum += matrix[i][j];
        //         } else if(i+j == matrix.length - 1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        for(int i=0; i<matrix.length; i++){ //O(n)
            //pd
            sum += matrix[i][i];
            //sd
            if(i != matrix.length-1-i)
                sum+= matrix[i][matrix.length-1-i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.print(diagonalSum(matrix));;
    }
}
