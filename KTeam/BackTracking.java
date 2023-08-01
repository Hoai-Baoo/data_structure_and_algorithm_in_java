package KTeam;
import java.util.Stack;

public class BackTracking {

    final static int MaxN = 1 + (int)1e5;
    static int n=7;
    static boolean[][] mark = new boolean[3][MaxN];
    static Stack<Integer> st = new Stack<>();
    public static int numberOfSolution=0;
    public static void main(String[] args) {
        Try(1);   
        System.out.println("Number: " +  numberOfSolution);
    }

    public static void Try(int row) {
        if (row == n+1) {
            for(int i=0; i<n; i++) {
                System.out.println((i+1) +": " + st.get(i));
            }
            System.out.println("-----------");
            numberOfSolution++;
            return;
        }
        for (int col=1; col<=n; ++col) {
            int mainDiagonal=row-col+n;
            int subDiagonal=row+col;
            // mark[0][]: col
            // mark[1][]: mainDiagonal
            // mark[2][]: subDiagonal
            if (mark[0][col] || mark[1][mainDiagonal] || mark[2][subDiagonal]) 
                continue;
                
            mark[0][col] = true;
            mark[1][mainDiagonal] = true;
            mark[2][subDiagonal] = true;
            
            st.push(col);
            Try(row+1);
            st.pop();
            mark[0][col] = false;
            mark[1][mainDiagonal] = false;
            mark[2][subDiagonal] = false;
        }
    }
    
}
