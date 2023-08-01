package KTeam;

public class PrefixSum2D {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        int[][] input= {{2,3,4,2,3},
                        {4,1,2,3,4},
                        {5,4,3,6,2},
                        {3,1,2,4,8}};

        int[][] squareSum = new int[n+1][m+1];
        // squareSum[0][1] = 3;
        // squareSum[0][0] = 2;
        // squareSum[1][0] = 4;
        for (int i=1; i<=n; ++i) {
            for (int j=1; j<=m; ++j) {
                squareSum[i][j] = squareSum[i-1][j] + squareSum[i][j-1] - squareSum[i-1][j-1] + input[i-1][j-1];
            }
        }

        int i=1,j=1,k=4,h=5;
        int res = squareSum[k][h] - squareSum[i-1][h]-squareSum[k][j-1]+squareSum[i-1][j-1];
        System.out.println(res);

    }
}
