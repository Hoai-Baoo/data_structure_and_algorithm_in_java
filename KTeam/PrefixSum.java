package KTeam;

public class PrefixSum {
    public static void main(String[] args) {
        
        int[] arr = {2,3,4,5,1,8};

        int[][] queries = {{1,4},{3,6},{2,5}};

        int[] res = solution2(arr, queries);
        
        for (int i:res) {
            System.out.print(i + " ");
        }
    }
    
    public static int[] solution1(int[] arr, int[][] queries) {
        int res[] = new int[queries.length];
        int t = 0;
        while (t<queries.length) {
            int start = queries[t][0]-1;
            int end = queries[t][1];
            int sum = 0;
            for (int i=start; i<end; i++) {
               sum += arr[i]; 
            }
            res[t] = sum;
            t++;
        }
        return res;
    }
    public static int[] solution2(int[] arr, int[][] queries) {
        int[] res = new int [queries.length];
        int[] S = new int[arr.length+1];

        for (int i=1; i<=arr.length; i++) {
            S[i] = S[i-1] + arr[i-1];
        }
        
        int t = 0;
        while (t<queries.length) {
            int start = queries[t][0]-1;
            int end = queries[t][1];
            res[t] = S[end] - S[start];
            t++;
        }
        return res;
    }
}
