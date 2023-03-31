import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        // 2.1 //

/*        int[] nums = {2, 3, 1, 7, 11};
        Arrays.sort(nums);

        int[] arrDesc = new int[nums.length];

        int j = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            arrDesc[j] = nums[i];
            j++;
        }

        System.out.println(Arrays.toString(arrDesc));*/

        // 2.2 //

/*        Integer[] nums = {2, 3, 1, 7, 11};
        Arrays.sort(nums, Collections.reverseOrder());

        for (int values : nums) {
            System.out.print(values + ", ");}*/


        // 3 //
   /*
        int[] nums = {-2, 13, 551, -7};
        int a = 10;

        for (int b :nums){
            if (b > 0){
                a = a + b;
            }
        }
        System.out.println(a);*/


        // 4 //
/*
        int[] nums = {15, -1, 18, 32, 16, 21, 99};
        int result = 0;
        for (int a : nums) {
            result += a;
        }
        System.out.println(+result / nums.length);
*/


    }
}

