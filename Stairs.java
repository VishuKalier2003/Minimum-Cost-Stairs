/* You are given an integer array cost where cost[i] is the cost of ith step on a staircase... Once you pay the cost, you can either climb one or two steps... You can either start from the step with index 0, or the step with index 1... Return the minimum cost to reach the top of the floor...
 * Eg 1: cost = [10,15,20]                         Output = 15
 * Eg 2: cost = [1,100,1,1,1,100,1,1,100,1]        Output = 6
 */
import java.util.*;
public class Stairs
{
    public int MinCostStairs(int[] cost)
    {
        int dp[] = new int[cost.length];      // Creating the DP Array...
        for(int i = 0; i < cost.length; i++)
        {
            if(i < 2)
                dp[i] = cost[i];    // Base Conditions...
            else
                dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);   // Choosing the Minimum of the two steps...
            System.out.print(dp[i]+", ");    // Printing the DP Array...
        }
        System.out.println();
        return Math.min(dp[cost.length-1], dp[cost.length-2]);    // Getting the minimum of the last two...
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Enter length of the Array : ");
        x = sc.nextInt();
        int arr[] = new int[x];
        for(int i = 0; i < x; i++)
        {
            System.out.print("Enter data : ");
            arr[i] = sc.nextInt();
        }
        Stairs stairs = new Stairs();   // Object creation...
        System.out.println("Minimum Cost : "+stairs.MinCostStairs(arr));    // Function call...
        sc.close();
    }
}

// Time Complexity  - O(n) time...
// Space Complexity - O(n) space...

/* DEDUCTIONS :- 
 * 1. The Recurrence Relation formed is T(n) = cost(n) + min(cost(n-1), cost(n-2))...
 * 2. Since it is a Recurrence relation, it can be solved using Dynamic Programming and Recursion...
*/