/**
 * Demolition Robot
 * Given a matrix with values 0 (trenches) , 1 (flat) , and 9 (obstacle) you have to find minimum distance to reach 9 (obstacle). If not possible then return -1.
 * The demolition robot must start at the top left corner of the matrix, which is always flat, and can move on block up, down, right, left.
 * The demolition robot cannot enter 0 trenches and cannot leave the matrix.
 * Sample Input :
 * [1, 0, 0],
 * [1, 0, 0],
 * [1, 9, 1]]
 * Sample Output :
 * 3
 * This question can be solved by using BFS or DFS.
 *
 *
 */

public class DemolitionRobot {

    int[][] dirs = {{-1,0}, {1,0}, {0,1}, {-1,0}};
    public static int minimumMoves(int[][] arr) {
        return 0;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,0,0}, {1,0,0}, {1,9,1}};
        System.out.println("Min moves to reach obstacle: "+minimumMoves(arr));
    }
}
