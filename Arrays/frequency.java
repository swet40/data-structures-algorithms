import java.util.Arrays;

public class frequency {
    public static int countFrequency(int[][] matrix){
        int count = 0;
        for(int row[] : matrix){
            for(int num : row){
                if(num == 7){
                    count ++;
                }
            }
        }
        return count;
    }

    public static int sumOfRow(int[][] matrix){
        int sum = 0;
        for(int i =0; i<matrix[0].length; i++){
            sum += matrix[1][i];
        }
        return sum;
    }

    public static void transpose(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        for(int[] row : transpose){
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] matrix= {
                    {4,7,8},
                    {8,8,7}
                    };
        // System.out.print(countFrequency(matrix));;
        transpose(matrix);
    }
}
