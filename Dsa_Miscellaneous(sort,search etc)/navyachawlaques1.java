class Solution{
    
    public int[][]  StrassenMultiplication(int[][] Mat_A, int[][] Mat_B){
        
        int N = Mat_A.length;
        
        int[][] Res = new int[N][N];

       
        if (N == 1)
           
            Res[0][0] = Mat_A[0][0] * Mat_B[0][0];
       
        else {
           
            int[][] A_11 = new int[N / 2][N / 2];
            int[][] A_12 = new int[N / 2][N / 2];
            int[][] A_21 = new int[N / 2][N / 2];
            int[][] A_22 = new int[N / 2][N / 2];
           
            int[][] B_11 = new int[N / 2][N / 2];
            int[][] B_12 = new int[N / 2][N / 2];
            int[][] B_21 = new int[N / 2][N / 2];
            int[][] B_22 = new int[N / 2][N / 2];

         
            divide(Mat_A, A_11, 0, 0);
            divide(Mat_A, A_12, 0, N / 2);
            divide(Mat_A, A_21, N / 2, 0);
            divide(Mat_A, A_22, N / 2, N / 2);

        
            divide(Mat_B, B_11, 0, 0);
            divide(Mat_B, B_12, 0, N / 2);
            divide(Mat_B, B_21, N / 2, 0);
            divide(Mat_B, B_22, N / 2, N / 2);

         
            int[][] P_1 = StrassenMultiplication(Add_Matrices(A_11, A_22), Add_Matrices(B_11, B_22));
            int[][] P_2 = StrassenMultiplication(Add_Matrices(A_21, A_22), B_11);
            int[][] P_3 = StrassenMultiplication(A_11, Sub_Matrices(B_12, B_22));
            int[][] P_4 = StrassenMultiplication(A_22, Sub_Matrices(B_21, B_11));
            int[][] P_5 = StrassenMultiplication(Add_Matrices(A_11, A_12), B_22);
            int[][] P_6 = StrassenMultiplication(Sub_Matrices(A_21, A_11), Add_Matrices(B_11, B_12));
            int[][] P_7 = StrassenMultiplication(Sub_Matrices(A_12, A_22), Add_Matrices(B_21, B_22));

           
            int[][] C_11 = Add_Matrices(Sub_Matrices(Add_Matrices(P_1, P_4), P_5), P_7);
            int[][] C_12 = Add_Matrices(P_3, P_5);
            int[][] C_21 = Add_Matrices(P_2, P_4);
            int[][] C_22 = Add_Matrices(Sub_Matrices(Add_Matrices(P_1, P_3), P_2), P_6);

            
            JoinMat(C_11, Res, 0, 0);
            JoinMat(C_12, Res, 0, N / 2);
            JoinMat(C_21, Res, N / 2, 0);
            JoinMat(C_22, Res, N / 2, N / 2);
        }
        
        return Res;
    }
   
    public int[][] Sub_Matrices(int[][] Mat_A, int[][] Mat_B){
        int N = Mat_A.length;
        int[][] Res = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                 
                Res[i][j] = Mat_A[i][j] - Mat_B[i][j];
        
        return Res;
    }
    // Function to add the given two matrices
    public int[][] Add_Matrices(int[][] Mat_A, int[][] Mat_B){
        int N = Mat_A.length;
      
        int[][] Res = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
               
                Res[i][j] = Mat_A[i][j] + Mat_B[i][j];
        
        return Res;
    }
    
    public void divide(int[][] Mat_A, int[][] Mat_B, int K, int M){
        for (int i_1 = 0, i_2 = K; i_1 < Mat_B.length; i_1++, i_2++)
            for (int j_1 = 0, j_2 = M; j_1 < Mat_B.length; j_1++, j_2++)
                Mat_B[i_1][j_1] = Mat_A[i_2][j_2];
    }

    
    public void JoinMat(int[][] A, int[][] B, int K, int M){
        for (int i_1 = 0, i_2 = K; i_1 < A.length; i_1++, i_2++)
            for (int j_1 = 0, j_2 = M; j_1 < A.length; j_1++, j_2++)
                B[i_2][j_2] = A[i_1][j_1];
    }
   
    public static void main(String[] args){
       
        Solution obj = new Solution();
        
        int N =3;
       
        int[][] Mat_A =  {  { 5, 2, 9, 6 }, { 4, 3, 2, 0 }, { 3, 5, 7, 6 } };
       
        int[][] Mat_B = {  { 2, 9, 5, 3 }, { 1, 2, 6, 7 }, { 2, 4, 9, 6 } };

       
        int[][] Result = obj.StrassenMultiplication(Mat_A, Mat_B);
      
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
               
                System.out.print(Result[i][j] + " ");
            System.out.println();
        }
    }
}