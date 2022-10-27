public class _3SearchInRange {
    public static void main(String[] args) {
        //search for 3 in the range of index 1 to 4

        int[] arr={18,12,-7,28,3,14,22};
        int target =3;
        System.out.println(linearSearch_retunindex(arr,target,1,5));
    }
    static int linearSearch_retunindex(int[] arr, int target, int start , int end) {
        if (arr.length == 0) {
            return -1;
        }

//        run a for loop
        for (int index = start; index <= end; index++) {
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
