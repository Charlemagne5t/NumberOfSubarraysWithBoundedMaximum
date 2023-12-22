import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        int[] nums = {2,1,4,3};
        int left = 2;
        int right = 3;
        int expected = 3;
        int actual = new Solution().numSubarrayBoundedMax(nums, left, right);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        int[] nums = {2,9,2,5,6};
        int left = 2;
        int right = 8;
        int expected = 7;
        int actual = new Solution().numSubarrayBoundedMax(nums, left, right);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        int[] nums = {73,55,36,5,55,14,9,7,72,52};
        int left = 32;
        int right = 69;
        int expected = 22;
        int actual = new Solution().numSubarrayBoundedMax(nums, left, right);

        Assert.assertEquals(expected, actual);
    }

}
