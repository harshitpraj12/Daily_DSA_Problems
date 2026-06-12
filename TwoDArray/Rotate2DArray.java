package TwoDArray;

public class Rotate2DArray {
    public static void main(String[] args) {

        int [][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // 00, 01, 02 - 10, 11, 12 - 20, 21, 22
        // 02, 12, 22 - 01, 11, 22 - 01, 10, 20
        // 20, 10, 00 - 21, 11, 01 - 

        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(row+" and "+ col);

        // Transpose Matrix
        for(int i = 0; i<row; i++){
            for(int j = i; j<col; j++){
                // matrix[i][j] = matrix[j][i];
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Rotate each rows
        for(int i = 0; i<row; i++){
            int s = 0;
            int end = matrix[0].length-1;
            while(s<end){
                int temp = matrix[i][s];
                matrix[i][s] = matrix[i][end];
                matrix[i][end] = temp;
                s++;
                end--;
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
