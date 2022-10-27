public class _1Main {

    public static void main(String[] args) {

        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;



        boolean ans = linearSearch3(nums, target);
        System.out.println(ans);

        int sol= linearSearch_retunindex(nums , target);
        System.out.println(sol);
    }

    // search the target and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

//        run a for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }


    // return index
    static int linearSearch_retunindex(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

//        run a for loop
        for (int index = 0; index < arr.length; index++) {
            int element= arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}



