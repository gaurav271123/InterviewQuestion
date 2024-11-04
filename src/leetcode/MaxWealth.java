package leetcode;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,6,1},{5,2,1}};
        int i = maximumWealth(arr);
        System.out.println(i);
    }

    static int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum=0;
            for (int j = 0; j < accounts[i].length; j++)
                sum += accounts[i][j];
            if (sum>ans){
                ans =sum;
            }
        }
        return ans;
    }
}
