public class Matrix {
    public static void main(String[] args) {
        int [][] a = {{1, 2, 3},{2, 3, 4},{3, 4, 5}};
        int [][] b = {{2, 3, 4},{3, 4, 5},{1, 2, 3}};
        // int [][] l = {
        //     {1, 2, 3},
        //     {2, 3, 4},
        //     {3, 4, 5}
        // };
        int [][] res = new int[3][3];
        int m=3, n=3, p=3, q = 3;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(res[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<m; i++){
            for(int j=0; j<q; j++){
                for(int k=0; k<n; k++){
                    res[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(res[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
