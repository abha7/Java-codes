import java.util.Arrays;

public class _5_2Darray {
    public static void main(String[] args) {
        int[][] arr={
                {23,4,1},
                {18,12,3,9},
                {89,22,76,43},
                {13,11}

        };
        int target = 22;
        int[] ans = search(arr,target);// format of return value {row,col}
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};

                }
            }
        }
        return new int[]{-1,-1};
    }


}
