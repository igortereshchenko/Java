/**
 * Created by Igor on 4/21/2017.
 */
public class Runner {

    public static void main(String[] args){


        //Объявление массива

        int nums1[];
        int[] nums2;

        int[] nums = new int[4];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 4;
        nums[3] = 100;

        System.out.println(nums[3]);


        // эти два способа равноценны
        int[] nums3 = new int[] { 1, 2, 3, 5 };

        int[] nums4 = { 1, 2, 3, 5 };
        //-------------------------------------------------


        // Многомерные массивы
        int[][] nums6 = new int[2][3];

        int[][] nums5 = { { 0, 1, 2 }, { 3, 4, 5 } };


        int[][][] nums7 = new int[3][2][2];

        int[][][] nums8={
                            {
                                {1,1},
                                {2,2}
                            },
                            {
                                {3,3},
                                {4,4}
                            },
                            {
                                {5,5},
                                {6,6}
                            }
                        };
        //-------------------------------------------------

        //Массив массивов
        int[][] nums9 = new int[3][];
        nums9[0] = new int[2];
        nums9[1] = new int[3];
        nums9[2] = new int[5];

    }
}
