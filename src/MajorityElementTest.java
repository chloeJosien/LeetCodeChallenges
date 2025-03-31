import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
public class MajorityElementTest {

    MajorityElement majorityElement = new MajorityElement();

    @Test
    public void testMajorityElement() {
        int[] nums = new int[]{3,3,4};
        int result = majorityElement.majorityElement(nums);
        Assert.assertEquals(result, 3);
    }

    @Test
    public void testMajorityElement2() {
        int[] nums = new int[]{3,2,3};
        int result = majorityElement.majorityElement(nums);
        Assert.assertEquals(result, 3);
    }


    @Test
    public void testMajorityElement3() {
        int[] nums = new int[]{2,2,1,1,1,2,2};
        int result = majorityElement.majorityElement(nums);
        Assert.assertEquals(result, 2);
    }
}